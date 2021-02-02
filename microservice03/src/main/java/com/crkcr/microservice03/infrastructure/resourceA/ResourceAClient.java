package com.crkcr.microservice03.infrastructure.resourceA;

import com.crkcr.microservice03.application.ResourceA;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

@Service
public class ResourceAClient {

    private final ResourceAFeignClient resourceAClient;

    public ResourceAClient(ResourceAFeignClient resourceAClient) {
        this.resourceAClient = resourceAClient;
    }

    @CircuitBreaker(name = "backendC", fallbackMethod = "fallback")
    public ResourceA getData() {
        return resourceAClient.resourceA();
    }

    public ResourceA fallback(Exception e) {
        ResourceAData mock = new ResourceAData();
        mock.setRandom(0);
        mock.setValue("Mock - Service down: " + e);
        return mock;
    }

}
