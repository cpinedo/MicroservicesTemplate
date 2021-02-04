package com.crkcr.microservice03.infrastructure;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.cloud.sleuth.instrument.async.TraceableExecutorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;

@Configuration
public class ServiceConfiguration {

    @Bean
    public TraceableExecutorService executorService(BeanFactory beanFactory) {
        return new TraceableExecutorService(beanFactory, Executors.newCachedThreadPool());
    }
}
