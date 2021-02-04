package com.crkcr.microservice01.infrastructure;

import com.crkcr.microservice01.domain.BasicResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping(value = "/resourceA")
public class BasicResourceAResource {

    @GetMapping//(headers = "Accept=application/json")
    public CompletableFuture<BasicResource> resourceA(@RequestHeader Map<String, String> headers){
        return CompletableFuture.supplyAsync(() -> BasicResource.of("Basic A"));
    }
}
