package com.crkcr.microservice03.infrastructure;

import brave.Tracer;
import com.crkcr.microservice03.application.Aggregated;
import com.crkcr.microservice03.application.GetAggregatedResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.cloud.sleuth.instrument.async.TraceableExecutorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping(value = "/resourceC")
public class BasicResourceCResource {
    private final GetAggregatedResource useCase;
    private final Tracer tracer;
    private final BeanFactory beanFactory;
    private final TraceableExecutorService traceableExecutorService;

    public BasicResourceCResource(GetAggregatedResource useCase, Tracer tracer, BeanFactory beanFactory, TraceableExecutorService traceableExecutorService) {
        this.useCase = useCase;
        this.tracer = tracer;
        this.beanFactory = beanFactory;
        this.traceableExecutorService = traceableExecutorService;
    }

    @GetMapping
    public CompletableFuture<Aggregated> resourceC() {
        return CompletableFuture.supplyAsync(
                () -> useCase.getData(tracer.currentSpan().context()),
                traceableExecutorService
        );
    }
}
