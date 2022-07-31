package br.com.example.productcatalogservice.service.buscar;

import br.com.example.productcatalogservice.model.Product;
import br.com.example.productcatalogservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class SearshProductService {

    @Autowired
    private ProductRepository repository;

    public Product porId(String id) {
        return repository.findById(String.valueOf(id))
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Product not found"));
    }
}
