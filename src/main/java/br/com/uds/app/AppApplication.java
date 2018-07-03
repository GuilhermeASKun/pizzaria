package br.com.uds.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.uds")
public class AppApplication {

	public static void main(String[] args) {
		System.err.println("main");
		SpringApplication.run(AppApplication.class, args);
	}
}
