package com.example.orderservice.controller;

import com.example.orderservice.service.cart.AddItemCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

   /* @Autowired
    private AddItemCartService addItemOrderService;

    @PostMapping("/add/{productId}")
    public void addProductInOrder(@PathVariable String productId){
        addItemOrderService.add(productId);
    }*/
}
