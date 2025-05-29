package com.carbonfoodprint.service_history;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceHistoryApplication {

	public static void main(String[] args) {
		if (System.getenv("RAILWAY_ENVIRONMENT") == null) {
			// Solo carga .env en desarrollo
			Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
			dotenv.entries().forEach(entry ->
					System.setProperty(entry.getKey(), entry.getValue())
			);
		}
		SpringApplication.run(ServiceHistoryApplication.class, args);
	}

}
