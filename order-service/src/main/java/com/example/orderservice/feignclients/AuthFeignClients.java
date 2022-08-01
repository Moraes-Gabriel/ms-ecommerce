package com.example.orderservice.feignclients;

import com.example.orderservice.controller.response.ProductResponse;
import com.example.orderservice.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "auth-service", path = "/auth")
public interface AuthFeignClients {

    @GetMapping()
    User userAutentiqued();


}
