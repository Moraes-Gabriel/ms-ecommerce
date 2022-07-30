package br.com.example.productcatalogservice.controller;

import br.com.example.productcatalogservice.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    @GetMapping()
    public Product testeProduto(){
        Product product = new Product();
        product.setId("UH23O123O12");
        product.setName("moraes");

        return product;
    }
}
