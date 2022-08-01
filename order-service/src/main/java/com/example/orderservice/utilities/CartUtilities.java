package com.example.orderservice.utilities;

import com.example.orderservice.model.Product;

import java.math.BigDecimal;

public class CartUtilities {

    public static BigDecimal SubTotalCart(Product product, int quantity){
        return BigDecimal.valueOf( quantity ).multiply( product.getPrice() );
    }
}
