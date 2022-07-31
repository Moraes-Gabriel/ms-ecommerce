package br.com.example.productcatalogservice.model;

import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Builder
@Getter
@Setter
@EqualsAndHashCode(of = "id") @ToString(of = "id")
@Document
public class Product {

    @Id
    private String id;

    @NotBlank()
    @UniqueElements
    private String name;

    @NotBlank()
    private BigDecimal price;

    @NotBlank()
    private String discription;

    @NotBlank()
    private String category;

    @NotBlank()
    private int availability;
}
