package com.example.orderservice.repository;

import com.example.orderservice.model.Cart;
import com.example.orderservice.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<Cart,String> {
}
