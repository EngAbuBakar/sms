/*package com.stockManagementSystem.sms.controller;

import com.stockManagementSystem.sms.Entity.Stock;
import com.stockManagementSystem.sms.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stock")
public class  StockController {
    @Autowired
    StockService stockService;
    @GetMapping("/{sku_code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@PathVariable("sku_code")String skuCode)
    {
     return stockService.isInStock(skuCode);
    }

}
*/