package com.stockManagementSystem.sms.Model;

import com.stockManagementSystem.sms.Entity.CustomerDetail;
import lombok.Data;

@Data
public class ProductSaleModel {
    private Long productSaleId;
    private int quantity;

    private double totalAmount;
     double discoutAmount;

    private CustomerDetail customerDetails;

    public ProductSaleModel( long productSaleId, int quantity, double totalAmount, double discoutAmount){
        this.productSaleId=productSaleId;
        this.quantity=quantity;
        this.totalAmount=totalAmount;
        this.discoutAmount=discoutAmount;

    }

}
