package com.example.test.demo.repository;

import com.example.test.demo.model.InputModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InputRepository extends CrudRepository<InputModel, Long> {
}
