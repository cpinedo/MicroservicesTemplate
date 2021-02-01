package com.crkcr.microservice03.domain;

import java.util.concurrent.ThreadLocalRandom;

public class BasicResource {
    private final String value;
    private final Integer random;

    private BasicResource(String value, Integer random) {
        this.value = value;
        this.random = random;
    }

    public static BasicResource of(String value){
        return new BasicResource(value, ThreadLocalRandom.current().nextInt(0, 9999 + 1));
    }

    public String getValue() {
        return value;
    }

    public Integer getRandom() {
        return random;
    }
}
