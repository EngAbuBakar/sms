package com.stockManagementSystem.sms.Model;
import com.stockManagementSystem.sms.Entity.Product;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Builder
    public class ProductModel {
        private long Id;
        private String productTitle;
        private String productDesc;
        private String productType;
         double price;

      /*public ProductRequest (Long Id, String productTitle, String productDesc, String productType, double price)
       {

           this.Id=Id;
           this.productTitle=productTitle;
           this.productDesc=productDesc;
           this.productType=productType;
           this.price=price;
       }*/
    public ProductModel(Product product){
        this.setId(product.getId());
        this.setProductDesc(product.getProductDesc());
        this.setProductTitle(product.getProductTitle());
        this.setPrice(product.getPrice());
    }

    public Product dissamble(){
        Product product=new Product();

        product.setId(Id);
        product.setProductTitle(productTitle);
        product.setProductDesc(productDesc);
        product.setPrice(price);
        return product;
    }

    public ProductModel assamble(Product product){
           ProductModel productModel=new ProductModel();

          productModel.setId(this.getId());
          productModel.setProductTitle(this.getProductTitle());
          productModel.setProductDesc(this.getProductDesc());
          productModel.setPrice(this.getPrice());
           return productModel;
       }


    }


