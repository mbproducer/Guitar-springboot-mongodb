package com.supermarket.fruits.repository;


import com.supermarket.fruits.model.Guitar;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuitarRepository extends MongoRepository<Guitar, String> {
}
