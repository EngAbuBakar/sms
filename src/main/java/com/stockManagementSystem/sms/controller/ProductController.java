package com.stockManagementSystem.sms.controller;

import com.stockManagementSystem.sms.Model.ProductModel;
import com.stockManagementSystem.sms.service.ProductService;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/product")

public class ProductController {
@Autowired
ProductService productService;
@PostMapping("/save")
@ResponseStatus(HttpStatus.CREATED)
public ProductModel craeteProduct(@RequestBody ProductModel productRequest)
{
   return productService.createProduct(productRequest);
}
     //get all products
@GetMapping("/getAllProducts")
@ResponseStatus(HttpStatus.OK)

   public List<ProductModel> getAllPrpducts(){
    return productService.getAllProduct();
}


    //Get product by ID
    @GetMapping(path = "/" )
    public List<ProductModel> getCountryById(@RequestParam(name = "id",required = false)Long Id,@RequestParam(name = "title",required = false)String title)
    {
        return productService.findProduct(Id,title);
    }

    @PutMapping(path = "/update")
    public String updateProduct(@RequestBody  ProductModel productModel)
    {
        return productService.updateProduct(productModel);
    }



    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") long Id){
    return productService.deleteProduct(Id);
    }



}


