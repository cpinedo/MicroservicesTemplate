package com.crkcr.microservice02.domain;

import java.util.concurrent.ThreadLocalRandom;

public class BasicResource {
    private final String value;
    private final Integer random;
    private final String configPhrase;

    private BasicResource(String value, Integer random, String configPhrase) {
        this.value = value;
        this.random = random;
        this.configPhrase = configPhrase;
    }

    public static BasicResource of(String value, String configPhrase){
        return new BasicResource(value, ThreadLocalRandom.current().nextInt(0, 9999 + 1), configPhrase);
    }

    public String getValue() {
        return value;
    }

    public Integer getRandom() {
        return random;
    }

    public String getConfigPhrase() {
        return configPhrase;
    }
}
