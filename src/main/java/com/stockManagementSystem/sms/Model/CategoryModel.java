package com.stockManagementSystem.sms.Model;

import com.stockManagementSystem.sms.Entity.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryModel {
    private long id;
    private String type;
    public CategoryModel(Category category) {
       // Product product = new Product();
        this.setId(category.getId());
        this.setType(category.getType());
    }


    public CategoryModel assemble(Category category) {
        CategoryModel categoryModel = new CategoryModel(category);
        categoryModel.setId(category.getId());
        categoryModel.setType(category.getType());
        return categoryModel;

    }

    public Category dissamble() {
        Category category = new Category();

        category.setId(this.id);
        category.setType(this.type);
        return category;
    }
}
