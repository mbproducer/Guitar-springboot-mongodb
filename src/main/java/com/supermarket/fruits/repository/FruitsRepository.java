package com.supermarket.fruits.repository;

import com.supermarket.fruits.model.Fruits;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitsRepository  extends MongoRepository<Fruits, String> {
}
