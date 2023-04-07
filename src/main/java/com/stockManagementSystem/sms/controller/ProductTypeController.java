package com.stockManagementSystem.sms.controller;

import com.stockManagementSystem.sms.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productType")
public class ProductTypeController {
    @Autowired
    ProductTypeService productTypeService;
    @PostMapping("/save")
    public String saveProductType()
    {
        return "save successfully";
    }
}
