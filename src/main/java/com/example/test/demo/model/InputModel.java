package com.example.test.demo.model;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class InputModel {

    @Id
    @GeneratedValue
    private long id;
    @Column(name = "input")
    private String angularInput;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
