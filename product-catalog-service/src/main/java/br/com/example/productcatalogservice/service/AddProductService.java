package br.com.example.productcatalogservice.service;

import br.com.example.productcatalogservice.controller.request.RequestAddProduct;
import br.com.example.productcatalogservice.mapper.AddProductMapper;
import br.com.example.productcatalogservice.model.Product;
import br.com.example.productcatalogservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static br.com.example.productcatalogservice.mapper.AddProductMapper.toEntity;
import static com.fasterxml.classmate.AnnotationOverrides.builder;

@Service
public class AddProductService {

    @Autowired
    private ProductRepository productRepository;


    public void addProduct(RequestAddProduct request) {

        Product teste = toEntity(request);

        Product product = Product.builder()
                .name(request.getName())
                .availability(request.getAvailability())
                .category(request.getCategory())
                .discription(request.getDiscription())
                .price(request.getPrice())
                .build();

        System.out.print(product);
        productRepository.save(product);
    }
}
