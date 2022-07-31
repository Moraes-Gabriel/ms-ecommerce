package com.example.orderservice.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.math.BigDecimal;

@Document
@Builder
@Getter
@Setter
@EqualsAndHashCode(of = "id") @ToString(of = "id")
public class Item {

    @Id
    private String _id;

    private Product product;

    private int quantity;

    private BigDecimal subTotal;
}
