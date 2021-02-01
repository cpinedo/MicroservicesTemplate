package com.crkcr.microservice03.infrastructure.resourceA;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "microservice01")
@RequestMapping(value = "/resourceA")
public interface ResourceAFeignClient {
    @GetMapping
    ResourceAData resourceA();
}
