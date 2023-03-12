package com.stockManagementSystem.sms.controller;

import com.stockManagementSystem.sms.Entity.Stock;
import com.stockManagementSystem.sms.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
    @Autowired
    StockService stockService;
    @PostMapping("/stock")
    private Long saveProduct(@RequestBody Stock stock)
    {
        stockService.saveOrUpdate(stock);
        return stock.getStockID();
    }

}
