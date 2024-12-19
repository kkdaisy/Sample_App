package me.jsk.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
        // System.setProperty("applicationinsights.configuration.file", "src/main/resources/applicationinsights-dev.json");
        // ApplicationInsights.attach();
		SpringApplication.run(Application.class, args);
	}

}
