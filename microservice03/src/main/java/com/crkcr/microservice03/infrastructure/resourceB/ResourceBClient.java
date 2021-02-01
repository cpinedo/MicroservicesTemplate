package com.crkcr.microservice03.infrastructure.resourceB;


import com.crkcr.microservice03.application.ResourceB;
import org.springframework.stereotype.Service;

@Service
public class ResourceBClient {
    public ResourceB getData(){
        return new ResourceBData();
    }
}
