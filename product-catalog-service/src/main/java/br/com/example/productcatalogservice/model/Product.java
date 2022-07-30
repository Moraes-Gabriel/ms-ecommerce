package br.com.example.productcatalogservice.model;

import lombok.*;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(of = "id") @ToString(of = "id")
public class Product {

    @Id
    private String id;

    @NotNull()
    private String name;

    @NotNull()
    private BigDecimal price;

    @NotNull()
    private String discription;

    @NotNull()
    private String category;

    @NotNull()
    private int availability;
}
