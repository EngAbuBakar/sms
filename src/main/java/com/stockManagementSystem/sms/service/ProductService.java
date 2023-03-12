package com.stockManagementSystem.sms.service;

import com.stockManagementSystem.sms.Repository.ProductRepository;
import com.stockManagementSystem.sms.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;


    public void saveOrUpdate(Product product)
    {
        productRepository.save(product);
    }

    public Object getBooksById(Long id)
    {
        return productRepository.findById(id).get();
    }
}
