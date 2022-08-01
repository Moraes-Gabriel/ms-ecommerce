package com.example.orderservice.service;


import com.example.orderservice.feignclients.AuthFeignClients;
import com.example.orderservice.model.User;
import com.example.orderservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAutentiquedService {

    @Autowired
    private AuthFeignClients authFeignClients;

    @Autowired
    private UserRepository userRepository;

    public User getUser(){
        String usurioId = authFeignClients.userAutentiqued().get_id();
        return userRepository.findById(usurioId).get();
    }
}
