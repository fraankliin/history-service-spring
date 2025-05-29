package com.carbonfoodprint.service_history.controller;

import com.carbonfoodprint.service_history.dto.DetailHistoryDTO;
import com.carbonfoodprint.service_history.dto.SummaryHistoryDTO;
import com.carbonfoodprint.service_history.service.HistoryDetailService;
import com.carbonfoodprint.service_history.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/history-service")
public class HistoryController {

    @Autowired
    HistoryService historyService;

    @Autowired
    HistoryDetailService historyDetailService;

    @GetMapping("/greeting")
    public Map<String, String> greeting(Principal principal){
        String username = principal.getName();
        Map<String, String> authInfo = new HashMap<>();
        authInfo.put("status", "authenticated");
        authInfo.put("username", username);
        return authInfo;
    }

    @GetMapping("/history")
    public ResponseEntity<List<SummaryHistoryDTO>> getHistory(Principal principal){
        String username = principal.getName();
        List<SummaryHistoryDTO> history = historyService.getHisttorialForUser(username);
        return ResponseEntity.ok(history);
    }


    @GetMapping("/{id}/detail")
    public ResponseEntity<DetailHistoryDTO> getHistoryDetail(@PathVariable Long id, Principal principal) {
        DetailHistoryDTO detalle = historyDetailService.getDetailHistory(id);
        return ResponseEntity.ok(detalle);
    }


}
