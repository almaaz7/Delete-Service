package com.almaaz.deleteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DeleteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeleteServiceApplication.class, args);
	}

}
