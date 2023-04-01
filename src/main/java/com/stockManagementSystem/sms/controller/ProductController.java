package com.stockManagementSystem.sms.controller;

import com.stockManagementSystem.sms.Model.ProductRequest;
import com.stockManagementSystem.sms.Model.ProductResponse;
import com.stockManagementSystem.sms.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/product")

public class ProductController {
@Autowired
ProductService productService;
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
public void craeteProduct(@RequestBody ProductRequest productRequest)
{
    productService.createProduct(productRequest);

}




@GetMapping
@ResponseStatus(HttpStatus.OK)
   public List<ProductResponse> getAllPrpducts(){
    return productService.getAllProducts();


}



}


