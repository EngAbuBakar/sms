package com.stockManagementSystem.sms.service;

import com.stockManagementSystem.sms.Entity.Product;
import com.stockManagementSystem.sms.Model.StockModel;
import com.stockManagementSystem.sms.Repository.ProductRepository;
import com.stockManagementSystem.sms.Repository.StockRepository;
import com.stockManagementSystem.sms.Entity.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StockService {
    @Autowired
    StockRepository stockRepository;
    @Autowired
    ProductRepository productRepository;

    public List<StockModel> getAllStocks() {
        List<Stock> stocks = (List<Stock>) stockRepository.findAll();
        return stocks.stream()
                .map(StockModel::new)
                .collect(Collectors.toList());
    }

    public StockModel getStockById(Long id) {
        Stock stock = stockRepository.findById(id).orElse(null);
        if (stock != null) {
            return new StockModel(stock);
        }
        return null;
    }

    public StockModel createStock(StockModel stockModel) {
        Product product=productRepository.findById(stockModel.getProductModel().getId()).get();
        Stock stock = stockModel.dissamble(product);
        stock = stockRepository.save(stock);
        return new StockModel(stock);
    }

    public StockModel updateStock(Long id, StockModel stockModel) {
        Stock existingStock = stockRepository.findById(id).orElse(null);
        if (existingStock != null) {
            Stock updatedStock = stockModel.dissamble(null);
            updatedStock.setId(id);
            updatedStock = stockRepository.save(updatedStock);
            return new StockModel(updatedStock);
        }
        return null;
    }

    public boolean deleteStock(Long id) {
        stockRepository.deleteById(id);
        return false;

    }
}