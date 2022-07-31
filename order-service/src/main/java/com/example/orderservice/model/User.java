package com.example.orderservice.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Set;

@Builder
@Getter
@Setter
@EqualsAndHashCode(of = "id") @ToString(of = "id")
@Document
public class User {

    @Id
    private String _id;

    private String name;

    private Set<Order> order;
}
