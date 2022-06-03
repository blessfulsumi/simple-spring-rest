package com.example.test.demo.service;

import com.example.test.demo.model.InputModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private InputModel inputModel = new InputModel();

    public InputModel getInput() {
        return inputModel;
    }

    public void postInput(InputModel inputModel) {
       this.inputModel = inputModel;
    }
}
