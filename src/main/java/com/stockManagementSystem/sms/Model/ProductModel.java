package com.stockManagementSystem.sms.Model;
import com.stockManagementSystem.sms.Entity.Product;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Builder
    public class ProductModel {
        private Long id;
        private String productTitle;
        private String productDesc;
        private CategoryModel categoryModel;
        private double price;


    public ProductModel(Product product){
        this.setId(product.getId());
        this.setProductDesc(product.getProductDesc());
        this.setProductTitle(product.getProductTitle());
        this.setPrice(product.getPrice());
        this.setCategoryModel(new CategoryModel(product.getCategory()));
    }

    public Product dissamble(){
        Product product=new Product();

        product.setId(id);
        product.setProductTitle(productTitle);
        product.setProductDesc(productDesc);
        product.setPrice(price);
        product.setCategory(categoryModel.dissamble());
        return product;
    }

    public ProductModel assamble(Product product){
           ProductModel productModel=new ProductModel();

          productModel.setId(product.getId());
          productModel.setProductTitle(product.getProductTitle());
          productModel.setProductDesc(product.getProductDesc());
          productModel.setPrice(product.getPrice());
          productModel.setCategoryModel(new CategoryModel(product.getCategory()));
           return productModel;
       }


    }


