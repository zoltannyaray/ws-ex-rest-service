package com.epam.nyz.restservice.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CalculateResult {

    private String result;

    public CalculateResult() {
    }

    public CalculateResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
