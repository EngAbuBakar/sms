package com.stockManagementSystem.sms.service;

import com.stockManagementSystem.sms.Entity.Product;
import com.stockManagementSystem.sms.Model.ProductModel;
import com.stockManagementSystem.sms.Repository.ProductRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ProductService {
    @Autowired

    ProductRepository productRepository;
    public ProductModel createProduct(ProductModel product)
    {
     return product.assamble(productRepository.save(product.dissamble()));

    }

    public List<ProductModel> getAllProduct()
    {
        return productRepository.findAll().stream().map(ProductModel::new).collect(Collectors.toList());
    }

    public List<ProductModel> findProduct(Long Id, String productTitle)
    {
        List<ProductModel> ProductModels = new ArrayList<>();
        if(Id != null)
        {
            ProductModels = List.of(productRepository.findAll()
                    .stream()
                    .map(ProductModel::new)
                    .filter(productModel -> productModel.getId()==Id)
                    .findFirst()
                    .get());

        }
        else if(productTitle != null)
        {
            ProductModels = List.of(productRepository.findAll()
                    .stream()
                    .map(ProductModel::new)
                    .filter(ProductModel -> ProductModel.getProductTitle().equalsIgnoreCase(productTitle))
                    .findFirst()
                    .get());

        }
        else
        {
            ProductModels = productRepository.findAll()
                    .stream()
                    .map(ProductModel::new)
                    .collect(Collectors.toList());
        }
        return ProductModels;
    }


    public String deleteProduct(long Id) {
        productRepository.deleteById(Id);
        return "product deleted successfully";
    }
}
