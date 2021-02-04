package com.crkcr.microservice03.infrastructure.resourceA;

import brave.Span;
import brave.Tracer;
import brave.propagation.TraceContext;
import com.crkcr.microservice03.application.ResourceA;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ResourceAClient {
    private static org.slf4j.Logger logger = LoggerFactory.getLogger(ResourceAClient.class);

    private final Tracer tracer;
    private final ResourceAFeignClient resourceAClient;

    public ResourceAClient(Tracer tracer, ResourceAFeignClient resourceAClient) {
        this.tracer = tracer;
        this.resourceAClient = resourceAClient;
    }

//    public ResourceAClient(@Qualifier("feignClient") Client ribbonClient, Tracer tracer) {
//        resourceAClient = Feign.builder()
//                .client(new TracingClient(ribbonClient, tracer))
//                .encoder(new GsonEncoder())
//                .decoder(new GsonDecoder())
//                .logger(new Slf4jLogger(ResourceAFeignClient.class))
//                .logLevel(Logger.Level.FULL)
//                .target(ResourceAFeignClient.class, "http://microservice01");
//    }

    @CircuitBreaker(name = "backendC", fallbackMethod = "fallback")
    public ResourceA getData(TraceContext span) {
//        Span span1 = tracer.newChild(span).name("microservice01AAAAAAAAAAAAA").start();
//        try {
            return resourceAClient.resourceA();
//        }finally{
//            span1.finish();
//        }
    }

    public ResourceA fallback(Exception e) {
        ResourceAData mock = new ResourceAData();
        mock.setRandom(0);
        mock.setValue("Mock - Service down: " + e);
        return mock;
    }

}
