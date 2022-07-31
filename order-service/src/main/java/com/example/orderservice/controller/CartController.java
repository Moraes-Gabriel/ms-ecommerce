package com.example.orderservice.controller;

import com.example.orderservice.service.AddItemOrderService;
import com.example.orderservice.service.cart.AddItemCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class CartController {

    @Autowired
    private AddItemCartService addItemCartService;

    @PostMapping("/add/{productId}/{quantity}")
    public void addProductInOrder(@PathVariable String productId, int quantity){
        

    }
}
