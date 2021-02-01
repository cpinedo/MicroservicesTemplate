package com.crkcr.microservice03.infrastructure.resourceB;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.CompletableFuture;

@FeignClient(name = "microservice02")
@RequestMapping(value = "/resourceB")
public interface ResourceBFeignClient {
    @GetMapping
    ResourceBData resourceB();
}
