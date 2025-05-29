package com.carbonfoodprint.service_history.config;

import com.carbonfoodprint.service_history.service.JwtService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    private JwtService jwtService;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        String authHeader = request.getHeader("Authorization");
        String token = null;

        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            handleException(response, "No se encontró el token en el header o es incorrecto");
            return;
        }

        token = authHeader.substring(7);

        if (token.isBlank()) {
            handleException(response, "El token está vacío");
            return;
        }

        try {
            if (jwtService.isTokenValid(token)) {
                String username = jwtService.extractUsername(token);

                UserDetails userDetails = User
                        .withUsername(username)
                        .password("") // requerido pero no se usa
                        .authorities(Collections.emptyList())
                        .build();

                UsernamePasswordAuthenticationToken authToken =
                        new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());

                SecurityContextHolder.getContext().setAuthentication(authToken);

                request.setAttribute("username", username); // opcional
                filterChain.doFilter(request, response); // solo si todo va bien
            } else {
                handleException(response, "El token no es válido");
            }
        } catch (ExpiredJwtException ex) {
            handleException(response, "El token ha expirado");
        } catch (MalformedJwtException | SignatureException ex) {
            handleException(response, "El token tiene un formato inválido o la firma no es válida");
        } catch (Exception ex) {
            handleException(response, "Error al procesar el token: " + ex.getMessage());
        }
    }

    private void handleException(HttpServletResponse response, String message) throws IOException {
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        response.setContentType("application/json");

        Map<String, Object> errorJson = new HashMap<>();
        errorJson.put("status", HttpStatus.UNAUTHORIZED.value());
        errorJson.put("error", "Unauthorized");
        errorJson.put("message", message);

        response.getWriter().write(new ObjectMapper().writeValueAsString(errorJson));
    }
}
