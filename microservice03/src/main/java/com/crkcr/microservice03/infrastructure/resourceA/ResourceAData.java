package com.crkcr.microservice03.infrastructure.resourceA;

import com.crkcr.microservice03.application.ResourceA;

public class ResourceAData implements ResourceA {
    public String value;
    public Integer random;

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
}
