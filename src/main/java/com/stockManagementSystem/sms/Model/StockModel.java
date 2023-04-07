package com.stockManagementSystem.sms.Model;

import com.stockManagementSystem.sms.Entity.Product;
import com.stockManagementSystem.sms.Entity.Stock;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class StockModel {
    private Long Id;

    private int quantity;

    private Product product;

    public StockModel(Stock stock){
        this.setId(stock.getId());
        this.setQuantity(stock.getQuantity());
        this.setProduct(stock.getProduct());

    }

    public Stock dissamble()
    {
        Stock stock=new Stock();
        stock.setId(Id);
        stock.setQuantity(quantity);
        stock.setProduct(product);
        return stock;
    }


}
