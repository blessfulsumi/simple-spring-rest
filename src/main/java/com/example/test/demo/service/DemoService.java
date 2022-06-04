package com.example.test.demo.service;

import com.example.test.demo.model.InputModel;
import com.example.test.demo.repository.InputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DemoService {
    @Autowired
    private InputRepository inputRepository;
    private long id;

    public InputModel getInput() {
        return inputRepository.findById(id).get();
    }

    public void postInput(InputModel inputModel) {
        inputRepository.deleteAll();
        inputModel = inputRepository.save(inputModel);
        id = inputModel.getId();
    }
}
