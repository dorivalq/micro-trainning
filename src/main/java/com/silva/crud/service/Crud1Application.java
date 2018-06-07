package com.silva.crud.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class Crud1Application {

	public static void main(String[] args) {
		SpringApplication.run(Crud1Application.class, args);
	}
}
