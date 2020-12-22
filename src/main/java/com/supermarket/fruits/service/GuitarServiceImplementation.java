package com.supermarket.fruits.service;

import com.supermarket.fruits.model.Guitar;
import com.supermarket.fruits.repository.GuitarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuitarServiceImplementation {

    @Autowired
    GuitarRepository guitarRepository;

    public List<Guitar> getAllGuitar(){

        return guitarRepository.findAll();

    }

    public Optional<Guitar> GetGuitarId( Guitar guitar){
    return guitarRepository.findById(guitar.getIdGuitar());

    }

    public String saveGuitar(Guitar guitar){
      guitarRepository.save(guitar);
      return "Guitar saved";
    }
}



