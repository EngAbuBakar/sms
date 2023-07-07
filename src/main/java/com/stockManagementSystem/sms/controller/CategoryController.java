package com.stockManagementSystem.sms.controller;

import com.stockManagementSystem.sms.Model.CategoryModel;
import com.stockManagementSystem.sms.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productType")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @PostMapping("/save")
    public String saveProductType(@RequestBody CategoryModel categoryModel)
    {
        return categoryService.save(categoryModel);
    }
}
