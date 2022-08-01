package com.example.orderservice.repository;

import com.example.orderservice.model.Item;
import com.example.orderservice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item,String> {
}
