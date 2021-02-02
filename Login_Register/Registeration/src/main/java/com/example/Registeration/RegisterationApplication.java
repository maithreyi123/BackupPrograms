package com.example.Registeration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RegisterationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterationApplication.class, args);
	}

}
