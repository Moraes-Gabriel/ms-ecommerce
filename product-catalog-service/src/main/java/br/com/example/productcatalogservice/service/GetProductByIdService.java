package br.com.example.productcatalogservice.service;

import br.com.example.productcatalogservice.controller.resonse.ProductResponse;
import br.com.example.productcatalogservice.mapper.AddProductMapper;
import br.com.example.productcatalogservice.model.Product;
import br.com.example.productcatalogservice.repository.ProductRepository;
import br.com.example.productcatalogservice.service.buscar.SearshProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static br.com.example.productcatalogservice.mapper.AddProductMapper.toResponse;

@Service
public class GetProductByIdService {

    @Autowired
    private SearshProductService searshProductService;

    public ProductResponse productById(String id){

        Product product = searshProductService.porId(id);

        return toResponse(product);
    }
}
