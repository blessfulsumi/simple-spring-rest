package com.example.test.demo.service;

import com.example.test.demo.model.InputModel;
import com.example.test.demo.repository.InputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private InputRepository inputRepository;

    public InputModel getInput() {
        long id = 1;
        return inputRepository.findById(id).get();
    }

    public void postInput(InputModel inputModel) {
        inputRepository.deleteAll();
        inputRepository.save(inputModel);
    }
}
