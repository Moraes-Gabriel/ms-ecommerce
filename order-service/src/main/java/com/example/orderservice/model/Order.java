package com.example.orderservice.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@Document
@Builder
@Getter
@Setter
@EqualsAndHashCode(of = "id") @ToString(of = "id")
public class Order {

    @Id
    private String _id;

    private List<Item> item;

    private OrderStatus status;

    private LocalDate orderDateTime;

    private BigDecimal amoungTotal;

}
