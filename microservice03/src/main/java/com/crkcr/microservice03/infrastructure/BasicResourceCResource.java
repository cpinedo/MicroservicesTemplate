package com.crkcr.microservice03.infrastructure;

import com.crkcr.microservice03.application.Aggregated;
import com.crkcr.microservice03.application.GetAggregatedResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping(value = "/resourceC")
public class BasicResourceCResource {

    private final GetAggregatedResource useCase;

    public BasicResourceCResource(GetAggregatedResource useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public CompletableFuture<Aggregated> resourceC() {
        return CompletableFuture.supplyAsync(useCase::getData);
    }
}
