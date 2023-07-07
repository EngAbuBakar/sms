package com.stockManagementSystem.sms.service;

import com.stockManagementSystem.sms.Model.CategoryModel;
import com.stockManagementSystem.sms.Entity.Category;
import com.stockManagementSystem.sms.Repository.CategoryRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public String save(CategoryModel categoryModel) {
        if (categoryRepository.findCategoryByType(categoryModel.getType()) == null) {
            categoryModel.assemble(categoryRepository.save(categoryModel.dissamble()));
            return "Category saved successfully.";
        } else {
            return "Category already exists.";
        }
    }
    public CategoryModel update(Long id, CategoryModel categoryModel) {
        Category existingCategory = categoryRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Category not found with id: " + id));
        Category updatedCategory = categoryModel.dissamble();
        updatedCategory.setId(existingCategory.getId());
        updatedCategory = categoryRepository.save(updatedCategory);
        return categoryModel.assemble(updatedCategory);
    }

    public String deleteCategory(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        if (category.isPresent()) {
            categoryRepository.deleteById(id);
            return "Category Deleted Successfully";
        } else {
            return "Category Not Found";
        }
    }

    public List<CategoryModel> findCategory() {
        List<Category> airLineFlights = categoryRepository.findAll();
        return airLineFlights.stream().map(airLineFlight -> new CategoryModel().assemble(airLineFlight)).collect(Collectors.toList());
    }




}
