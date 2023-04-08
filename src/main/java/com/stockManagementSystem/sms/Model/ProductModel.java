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
        private ProductTypeModel productType;
         double price;


    public ProductModel(Product product){
        this.setId(product.getId());
        this.setProductDesc(product.getProductDesc());
        this.setProductTitle(product.getProductTitle());
        this.setPrice(product.getPrice());
        this.setProductType(new ProductTypeModel(product.getProductType()));
    }

    public Product dissamble(){
        Product product=new Product();

        product.setId(id);
        product.setProductTitle(productTitle);
        product.setProductDesc(productDesc);
        product.setPrice(price);
        product.setProductType(productType.dissamble());
        return product;
    }

    public ProductModel assamble(Product product){
           ProductModel productModel=new ProductModel();

          productModel.setId(product.getId());
          productModel.setProductTitle(product.getProductTitle());
          productModel.setProductDesc(product.getProductDesc());
          productModel.setPrice(product.getPrice());
          productModel.setProductType(new ProductTypeModel(product.getProductType()));
           return productModel;
       }


    }


