package com.stockManagementSystem.sms.Model;

import com.stockManagementSystem.sms.Entity.ProductSale;
import com.stockManagementSystem.sms.Entity.Stock;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
    public class ProductModel {

        private Long productID;

        private String productTitle;

        private String productDesc;

        private String producType;

         double price;

        private Stock stock;

       public ProductModel(Long productID, String productTitle, String productDesc, String producType, double price)
       {
           this.productID=productID;
           this.productTitle=productTitle;
           this.productDesc=productDesc;
           this.producType=producType;
           this.price=price;
       }
    }


