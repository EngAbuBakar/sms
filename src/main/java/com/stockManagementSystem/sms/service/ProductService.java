package com.stockManagementSystem.sms.service;

import com.stockManagementSystem.sms.Entity.Product;
import com.stockManagementSystem.sms.Model.ProductRequest;
import com.stockManagementSystem.sms.Model.ProductResponse;
import com.stockManagementSystem.sms.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductService {
    @Autowired

    ProductRepository productRepository;
    public void createProduct(ProductRequest productRequest)
    {
     Product product=Product.builder()
             .Id(productRequest.getId())
             .productDesc(productRequest.getProductDesc())
             .productTitle(productRequest.getProductTitle())
             .price(productRequest.getPrice())
             .build();


        productRepository.save(product);
    }

    public List<ProductResponse> getAllProducts() {
        List <Product> products = (List<Product>) productRepository.findAll();

        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return  ProductResponse.builder()
                .Id(product.getId())
                .productTitle(product.getProductTitle())
                .producType(product.getProducType())
                .productDesc(product.getProductDesc())
                .price(product.getPrice())
                .build();
    }

}
