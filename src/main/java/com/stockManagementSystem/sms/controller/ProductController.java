package com.stockManagementSystem.sms.controller;

import com.stockManagementSystem.sms.Entity.Product;
import com.stockManagementSystem.sms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
@Autowired

ProductService productService;
@PostMapping("/product")
private Long saveProduct(@RequestBody Product product)
{
   productService.saveOrUpdate(product);
    return product.getProductID();
}




@GetMapping("/product/{productId}")
    private Object getProduct(@PathVariable("productId") Long productId)
{
    return productService.getBooksById(productId);
}



}


