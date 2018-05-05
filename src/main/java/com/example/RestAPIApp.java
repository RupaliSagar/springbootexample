package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class RestAPIApp extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(RestAPIApp.class, args);
	}

}
