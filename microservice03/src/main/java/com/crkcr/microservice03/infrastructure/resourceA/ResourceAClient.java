package com.crkcr.microservice03.infrastructure.resourceA;

import com.crkcr.microservice03.application.ResourceA;
import org.springframework.stereotype.Service;

@Service
public class ResourceAClient {

    private final ResourceAFeignClient resourceAClient;

    public ResourceAClient(ResourceAFeignClient resourceAClient) {
        this.resourceAClient = resourceAClient;
    }

    public ResourceA getData() {
        return resourceAClient.resourceA();
    }
}
