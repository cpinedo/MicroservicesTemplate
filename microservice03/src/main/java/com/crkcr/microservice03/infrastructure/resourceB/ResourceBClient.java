package com.crkcr.microservice03.infrastructure.resourceB;


import com.crkcr.microservice03.application.ResourceB;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

@Service
public class ResourceBClient {
    private final ResourceBFeignClient resourceBClient;

    public ResourceBClient(/*@Qualifier("feignClient") Client ribbonClient*/ResourceBFeignClient resourceBClient) {
//        resourceBClient = Feign.builder()
//                .client(ribbonClient)
//                .encoder(new GsonEncoder())
//                .decoder(new GsonDecoder())
//                .logger(new Slf4jLogger(ResourceBFeignClient.class))
//                .logLevel(Logger.Level.FULL)
//                .target(ResourceBFeignClient.class, "http://microservice02");
        this.resourceBClient = resourceBClient;
    }

    @CircuitBreaker(name = "backendC", fallbackMethod = "fallback")
    public ResourceB getData() {
        return resourceBClient.resourceB();
    }

    private ResourceBData fallback(Exception e) {
        ResourceBData mock = new ResourceBData();
        mock.setRandom(0);
        mock.setValue("Mock - Service down: " + e);
        mock.setConfigPhrase("Mock - Service down");
        return mock;
    }
}
