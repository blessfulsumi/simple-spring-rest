package com.example.test.demo.controller;

import com.example.test.demo.model.InputModel;
import com.example.test.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200/")
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/getInput")
    private InputModel getInput() {
        return demoService.getInput();
    }

    @PostMapping("/postInput")
    private ResponseEntity<Void> postInput(@RequestBody InputModel input) {
        demoService.postInput(input);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
