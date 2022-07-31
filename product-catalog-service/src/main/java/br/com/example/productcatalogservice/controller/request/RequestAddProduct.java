package br.com.example.productcatalogservice.controller.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
public class RequestAddProduct {

    private String name;
    private BigDecimal price;
    private String discription;
    private String category;
    private int availability;
}
