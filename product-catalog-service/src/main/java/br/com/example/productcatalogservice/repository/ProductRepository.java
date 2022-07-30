package br.com.example.productcatalogservice.repository;

import br.com.example.productcatalogservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
