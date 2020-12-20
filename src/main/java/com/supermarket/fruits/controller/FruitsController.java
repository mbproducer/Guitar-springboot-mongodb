package com.supermarket.fruits.controller;

import com.supermarket.fruits.model.Fruits;
import com.supermarket.fruits.service.FruitsServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("fruits")
public class FruitsController {

    @Autowired
    FruitsServiceImplementation fruitsServiceImplementation;

    @GetMapping
    public List<Fruits> getAllFruits(){
        return fruitsServiceImplementation.getAllFruits();
    }

    @PostMapping
    public String saveFruit(Fruits fruits){
        return fruitsServiceImplementation.saveFruit(fruits);
    }
}
