package com.example.orderservice.service.buscar;

import com.example.orderservice.model.Item;
import com.example.orderservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class SearshItemService {

    @Autowired
    private ItemRepository repository;

    public Item byId(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Item not found"));
    }
}
