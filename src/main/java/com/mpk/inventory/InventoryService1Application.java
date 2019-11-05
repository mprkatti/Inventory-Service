package com.mpk.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InventoryService1Application {

	public static void main(String[] args) {
		SpringApplication.run(InventoryService1Application.class, args);
	}

}
