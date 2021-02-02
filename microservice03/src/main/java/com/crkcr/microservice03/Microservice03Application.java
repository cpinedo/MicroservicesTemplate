package com.crkcr.microservice03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class Microservice03Application {

    public static void main(String[] args) {
        SpringApplication.run(Microservice03Application.class, args);
    }

}
