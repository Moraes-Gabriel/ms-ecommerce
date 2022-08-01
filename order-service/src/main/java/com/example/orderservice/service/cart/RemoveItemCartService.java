package com.example.orderservice.service.cart;

import com.example.orderservice.feignclients.ProductFeignClients;
import com.example.orderservice.model.Item;
import com.example.orderservice.model.Product;
import com.example.orderservice.model.User;
import com.example.orderservice.repository.CartRepository;
import com.example.orderservice.repository.UserRepository;
import com.example.orderservice.service.UserAutentiquedService;
import com.example.orderservice.service.buscar.SearshItemService;
import com.example.orderservice.utilities.CartUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RemoveItemCartService {

    @Autowired
    private SearshItemService searshItemService;

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private UserAutentiquedService userAutentiquedService;

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void remove(String itemId) {
        User user = userAutentiquedService.getUser();
        user.getCart().getItem().remove(searshItemService.byId(itemId));
        userRepository.save(user);
    }
}
