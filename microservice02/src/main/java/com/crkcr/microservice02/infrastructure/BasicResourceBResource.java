package com.crkcr.microservice02.infrastructure;

import com.crkcr.microservice02.domain.BasicResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping(value = "/resourceB")
public class BasicResourceBResource {

    @Value("${application.resource.letter}")
    private String letter;

    @Value("${application.resource.phrase}")
    private String phrase;

    @GetMapping
    public CompletableFuture<BasicResource> resourceA() {
        return CompletableFuture.supplyAsync(() -> BasicResource.of("Basic " + letter, phrase));
    }
}
