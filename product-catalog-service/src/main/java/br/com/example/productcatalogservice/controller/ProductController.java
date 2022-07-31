package br.com.example.productcatalogservice.controller;

import br.com.example.productcatalogservice.controller.request.RequestAddProduct;
import br.com.example.productcatalogservice.controller.resonse.ProductResponse;
import br.com.example.productcatalogservice.model.Product;
import br.com.example.productcatalogservice.service.AddProductService;
import br.com.example.productcatalogservice.service.GetAllProductService;
import br.com.example.productcatalogservice.service.GetProductByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private GetAllProductService getAllProductService;

    @Autowired
    private GetProductByIdService getProductByIdService;

    @GetMapping()
    public List<ProductResponse> getAllProduct(){
        return getAllProductService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ProductResponse getProductById(@PathVariable String id){
        return getProductByIdService.productById(id);
    }
}
