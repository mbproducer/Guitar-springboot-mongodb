package com.supermarket.fruits.controller;

import com.supermarket.fruits.model.Fruits;
import com.supermarket.fruits.service.FruitsServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("fruits")
public class FruitsController {

    @Autowired
    FruitsServiceImplementation fruitsServiceImplementation;

    @GetMapping
    public List<Fruits> getAllFruits(){
        return fruitsServiceImplementation.getAllFruits();
    }

    @GetMapping("/fruit")
    public Optional<Fruits> getfruitid(@RequestBody Fruits fruit){
        return fruitsServiceImplementation.getfruitid(fruit);
    }

    @PostMapping
    public String saveFruit(@RequestBody Fruits fruits){
        return fruitsServiceImplementation.saveFruit(fruits);
    }
}
