package com.stockManagementSystem.sms.Model;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
    public class ProductRequest {
        private long Id;
        private String productTitle;
        private String productDesc;
        private String producType;
         double price;

      public ProductRequest (Long Id, String productTitle, String productDesc, String producType, double price)
       {

           this.Id=Id;
           this.productTitle=productTitle;
           this.productDesc=productDesc;
           this.producType=producType;
           this.price=price;
       }


    }


