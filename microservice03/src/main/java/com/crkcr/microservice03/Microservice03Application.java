package com.crkcr.microservice03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class Microservice03Application {

    public static void main(String[] args) {
        SpringApplication.run(Microservice03Application.class, args);
    }

}
