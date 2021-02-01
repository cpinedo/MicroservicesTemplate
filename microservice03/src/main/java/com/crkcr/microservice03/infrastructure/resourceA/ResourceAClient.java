package com.crkcr.microservice03.infrastructure.resourceA;

import com.crkcr.microservice03.application.ResourceA;
import org.springframework.stereotype.Service;

@Service
public class ResourceAClient {
    public ResourceA getData(){
        return new ResourceAData();
    }
}
