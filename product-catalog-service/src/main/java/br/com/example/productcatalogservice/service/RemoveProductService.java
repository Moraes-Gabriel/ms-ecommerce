package br.com.example.productcatalogservice.service;

import br.com.example.productcatalogservice.model.Product;
import br.com.example.productcatalogservice.repository.ProductRepository;
import br.com.example.productcatalogservice.service.buscar.SearshProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SearshProductService searshProductService;

    public void remove(String id) {
        productRepository.delete(searshProductService.porId(id));
    }
}
