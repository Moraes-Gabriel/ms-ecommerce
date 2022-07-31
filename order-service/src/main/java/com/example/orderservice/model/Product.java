package com.example.orderservice.model;

import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Builder
@Getter
@Setter
@EqualsAndHashCode(of = "id") @ToString(of = "id")
public class Product {

    private String id;
    private String name;
    private BigDecimal price;
    private String discription;
    private String category;
    private int availability;
}
