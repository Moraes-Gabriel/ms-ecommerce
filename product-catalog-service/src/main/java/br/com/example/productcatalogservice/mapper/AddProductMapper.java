package br.com.example.productcatalogservice.mapper;

import br.com.example.productcatalogservice.controller.request.RequestAddProduct;
import br.com.example.productcatalogservice.controller.resonse.ProductResponse;
import br.com.example.productcatalogservice.model.Product;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class AddProductMapper {

    public static Product toEntity(RequestAddProduct request) {
        return new ModelMapper().map(request, Product.class);
    }

    public static ProductResponse toResponse(Product entity) {
        return new ModelMapper().map(entity, ProductResponse.class);
    }

    public static List<ProductResponse> toResponse(List<Product> list) {
        return list
                .stream()
                .map(AddProductMapper::toResponse)
                .collect(Collectors.toList());
    }
}
