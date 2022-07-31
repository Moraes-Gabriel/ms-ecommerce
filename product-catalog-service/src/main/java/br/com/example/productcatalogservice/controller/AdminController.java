package br.com.example.productcatalogservice.controller;

import br.com.example.productcatalogservice.controller.request.RequestAddProduct;
import br.com.example.productcatalogservice.service.AddProductService;
import br.com.example.productcatalogservice.service.RemoveProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AddProductService addProductService;

    @Autowired
    private RemoveProductService removeProductService;

    @PostMapping("/products")
    public void addProduct(@RequestBody RequestAddProduct request){
        addProductService.addProduct(request);
    }
    @DeleteMapping("/{id}")
    public void removeProduct(@PathVariable String id){
        removeProductService.remove(id);
    }
}
