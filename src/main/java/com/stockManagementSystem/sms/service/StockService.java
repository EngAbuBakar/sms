package com.stockManagementSystem.sms.service;

import com.stockManagementSystem.sms.Repository.StockRepository;
import com.stockManagementSystem.sms.Entity.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {
    @Autowired
    StockRepository stockRepository;
    public void saveOrUpdate(Stock stock)
    {
        stockRepository.save(stock);
    }

}
