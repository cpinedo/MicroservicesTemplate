package com.crkcr.microservice03.application;

import com.crkcr.microservice03.domain.BasicResource;

public class Aggregated {
    private final BasicResource resource;
    private final ResourceA resourceA;
    private final ResourceB resourceB;

    public Aggregated(BasicResource resource, ResourceA resourceA, ResourceB resourceB) {
        this.resource = resource;
        this.resourceA = resourceA;
        this.resourceB = resourceB;
    }

    public BasicResource getResource() {
        return resource;
    }

    public ResourceA getResourceA() {
        return resourceA;
    }

    public ResourceB getResourceB() {
        return resourceB;
    }
}
