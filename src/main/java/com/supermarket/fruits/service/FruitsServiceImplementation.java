package com.supermarket.fruits.service;

import com.supermarket.fruits.model.Fruits;
import com.supermarket.fruits.repository.FruitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitsServiceImplementation {

    @Autowired
    FruitsRepository fruitsRepository;

    public List<Fruits> getAllFruits(){
        return fruitsRepository.findAll();
    }

    public String saveFruit(Fruits fruits){
        fruitsRepository.save(fruits);
        return "fruits is saved";
    }
}
