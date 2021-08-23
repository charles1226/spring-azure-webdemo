package com.azurewebdemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureWebdemoApplication {

	
	@GetMapping("/message")
	public String message() {
		return "Desplegando demo en azure";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureWebdemoApplication.class, args);
	}

}
