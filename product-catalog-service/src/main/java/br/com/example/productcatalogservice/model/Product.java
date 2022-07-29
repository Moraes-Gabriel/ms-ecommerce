package br.com.example.productcatalogservice.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "id") @ToString(of = "id")
public class Product {

    private long id;
    private String name;
}
