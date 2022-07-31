package com.example.orderservice.controller.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductResponse {
    private String id;
    private String name;
    private BigDecimal price;
    private String discription;
    private String category;
}
