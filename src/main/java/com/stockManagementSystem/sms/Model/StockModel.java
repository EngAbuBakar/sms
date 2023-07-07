package com.stockManagementSystem.sms.Model;

import com.stockManagementSystem.sms.Entity.Product;
import com.stockManagementSystem.sms.Entity.Stock;
import lombok.Data;

@Data
public class StockModel {
    private Long id;
    private Long quantity;
    private ProductModel productModel;

    public StockModel(Stock stock) {

        this.setId(stock.getId());
        this.setQuantity(stock.getQuantity());
        this.setProductModel(new ProductModel(stock.getProduct()));
    }
    public StockModel() {
        this.id=getId();
        this.quantity=getQuantity();
        this.productModel=new ProductModel();

    }


    public Stock dissamble(Product product) {
        Stock stock = new Stock();
        stock.setId(id);
        stock.setQuantity(quantity);
        stock.setProduct(product);

        return stock;

    }

    public StockModel assemble(Stock stock) {
        StockModel stockModel = new StockModel();
        stockModel.setId(stock.getId());
        stockModel.setQuantity(stock.getQuantity());
        stockModel.setProductModel(new ProductModel(stock.getProduct()));

        return stockModel;

    }


}
