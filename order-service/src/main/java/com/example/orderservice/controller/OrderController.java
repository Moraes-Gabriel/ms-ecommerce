package com.example.orderservice.controller;

import com.example.orderservice.controller.response.ProductResponse;
import com.example.orderservice.feignclients.ProductFeignClients;
import com.example.orderservice.service.AddItemOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private AddItemOrderService addItemOrderService;

    @PostMapping("/add/{productId}")
    public void addProductInOrder(@PathVariable String productId){
        

    }
}
