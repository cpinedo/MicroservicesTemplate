package com.crkcr.microservice03.infrastructure.resourceB;

import com.crkcr.microservice03.application.ResourceB;

public class ResourceBData implements ResourceB {
    public String value;
    public Integer random;
    public String configPhrase;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getRandom() {
        return random;
    }

    public void setRandom(Integer random) {
        this.random = random;
    }

    public String getConfigPhrase() {
        return configPhrase;
    }

    public void setConfigPhrase(String configPhrase) {
        this.configPhrase = configPhrase;
    }
}
