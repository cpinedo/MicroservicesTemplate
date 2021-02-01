package com.crkcr.microservice01.infrastructure;

import com.crkcr.microservice01.domain.BasicResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping(value = "/resourceA")
public class BasicResourceAResource {

    @GetMapping
    public CompletableFuture<BasicResource> resourceA(){
        return CompletableFuture.supplyAsync(() -> BasicResource.of("Basic A"));
    }
}
