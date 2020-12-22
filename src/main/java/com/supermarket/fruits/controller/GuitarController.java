package com.supermarket.fruits.controller;

import com.supermarket.fruits.model.Guitar;
import com.supermarket.fruits.service.GuitarServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("guitar")
public class GuitarController {

    @Autowired
    GuitarServiceImplementation guitarServiceImplementation;

    @GetMapping
    public List<Guitar> getAllGuitar(){
        return guitarServiceImplementation.getAllGuitar();
    }

    @GetMapping("/findById")
    public Optional<Guitar> GetGuitarId(@RequestBody Guitar guitar){
        return guitarServiceImplementation.GetGuitarId(guitar);
    }
    @PostMapping
    public String saveGuitar(@RequestBody Guitar guitar){
        return guitarServiceImplementation.saveGuitar(guitar);
    }
}
