package com.example.orderservice.controller;

import com.example.orderservice.service.cart.AddItemCartService;
import com.example.orderservice.service.cart.RemoveItemCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
public class CartController {

    @Autowired
    private AddItemCartService addItemCartService;

    @Autowired
    private RemoveItemCartService removeItemCartService;


    @PostMapping("/add/{productId}/{quantity}")
    public void addProductInCart(@PathVariable String productId, int quantity){
        addItemCartService.add(productId, quantity);
    }
    @DeleteMapping("/remove/{itemId}")
    public void removeProductInCart(@PathVariable String itemId){
        removeItemCartService.remove(itemId);
    }
}
