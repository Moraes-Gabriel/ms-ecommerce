package com.example.orderservice.feignclients;

import com.example.orderservice.controller.response.ProductResponse;
import com.example.orderservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient(name = "product-catalog-service", path = "/product")

public interface ProductFeignClients {

        @GetMapping(value = "/{id}")
        Product findById(@PathVariable String id);

    @GetMapping()
    List<ProductResponse> getAllProducts();
}
