package com.example.orderservice.feignclients;

import com.example.orderservice.controller.response.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient(name = "user-service", path = "/user")
public interface UserFeignClients {

    @GetMapping(value = "/{id}")
    ProductResponse findById(@PathVariable Long id);


}
