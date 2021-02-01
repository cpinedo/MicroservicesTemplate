package com.crkcr.microservice03.infrastructure.resourceB;


import com.crkcr.microservice03.application.ResourceB;
import org.springframework.stereotype.Service;

@Service
public class ResourceBClient {
    private final ResourceBFeignClient resourceBClient;

    public ResourceBClient(ResourceBFeignClient resourceBClient) {
        this.resourceBClient = resourceBClient;
    }

    public ResourceB getData() {
        return resourceBClient.resourceB();
    }
}
