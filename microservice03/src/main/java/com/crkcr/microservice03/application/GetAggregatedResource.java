package com.crkcr.microservice03.application;

import brave.Span;
import brave.propagation.TraceContext;
import com.crkcr.microservice03.domain.BasicResource;
import com.crkcr.microservice03.infrastructure.resourceA.ResourceAClient;
import com.crkcr.microservice03.infrastructure.resourceB.ResourceBClient;
import org.springframework.stereotype.Service;

@Service
public class GetAggregatedResource {

    private final ResourceAClient resourceAClient;
    private final ResourceBClient resourceBClient;

    public GetAggregatedResource(ResourceAClient resourceAClient, ResourceBClient resourceBClient) {
        this.resourceAClient = resourceAClient;
        this.resourceBClient = resourceBClient;
    }

    public Aggregated getData(TraceContext span) {
        return new Aggregated(
                BasicResource.of("Basic C"),
                resourceAClient.getData(span),
                resourceBClient.getData()
        );
    }
}
