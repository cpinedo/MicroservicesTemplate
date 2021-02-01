package com.crkcr.microservice02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Microservice02Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservice02Application.class, args);
	}

}
