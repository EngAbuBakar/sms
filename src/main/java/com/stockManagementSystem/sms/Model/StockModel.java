package com.stockManagementSystem.sms.Model;

import com.stockManagementSystem.sms.Entity.Product;
import lombok.Data;

@Data
public class StockModel {
    private Long stockID;
    private String stockType;

    private String stockDetail;

    private Product product;

    public StockModel(Long stockID, String stockType, String stockDetail, Product product){
        this.stockID=stockID;
        this.stockType=stockType;
        this.stockDetail=stockDetail;
        this.product=product;

    }
}
