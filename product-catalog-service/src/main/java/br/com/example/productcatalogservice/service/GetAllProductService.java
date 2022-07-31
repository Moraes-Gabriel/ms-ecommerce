package br.com.example.productcatalogservice.service;

import br.com.example.productcatalogservice.controller.resonse.ProductResponse;
import br.com.example.productcatalogservice.mapper.AddProductMapper;
import br.com.example.productcatalogservice.model.Product;
import br.com.example.productcatalogservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductResponse> getAllProducts() {
        return AddProductMapper.toResponse(productRepository.findAll());
    }
}
