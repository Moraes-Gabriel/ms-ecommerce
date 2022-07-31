package com.example.orderservice.controller;

import com.example.orderservice.controller.response.ProductResponse;
import com.example.orderservice.feignclients.ProductFeignClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("order")
public class ProductController {

    @Autowired
    private ProductFeignClients productFeignClients;

    @GetMapping()
    public List<ProductResponse> getProductById(){
        return productFeignClients.getAllProducts();
    }
}
