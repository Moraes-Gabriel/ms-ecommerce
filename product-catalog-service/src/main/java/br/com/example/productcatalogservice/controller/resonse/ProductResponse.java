package br.com.example.productcatalogservice.controller.resonse;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
public class ProductResponse {
    private String id;
    private String name;
    private BigDecimal price;
    private String discription;
    private String category;
}
