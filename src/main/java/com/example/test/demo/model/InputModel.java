package com.example.test.demo.model;

import org.springframework.stereotype.Component;

@Component
public class InputModel {
    private String angularInput;

    public InputModel() {
    }

    public InputModel(String angularInput) {
        this.angularInput = angularInput;
    }

    public String getAngularInput() {
        return angularInput;
    }

    public void setAngularInput(String angularInput) {
        this.angularInput = angularInput;
    }
}
