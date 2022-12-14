package com.example.orderservice.service.cart;

import com.example.orderservice.feignclients.AuthFeignClients;
import com.example.orderservice.feignclients.ProductFeignClients;
import com.example.orderservice.model.Item;
import com.example.orderservice.model.Product;
import com.example.orderservice.model.User;
import com.example.orderservice.repository.CartRepository;
import com.example.orderservice.repository.UserRepository;
import com.example.orderservice.service.UserAutentiquedService;
import com.example.orderservice.utilities.CartUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AddItemCartService {

    @Autowired
    private ProductFeignClients productFeignClients;

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private UserAutentiquedService userAutentiquedService;

    @Autowired
    private UserRepository userRepository;

    public void add(String productId, int quantity) {

       User user = userAutentiquedService.getUser();
        Product product = productFeignClients.findById(productId);

        Item item = Item.builder()
                .product(product)
                .quantity(quantity)
                .subTotal(CartUtilities.SubTotalCart(product, quantity))
                .build();

        user.getCart().getItem().add(item);
        userRepository.save(user);
    }


}
