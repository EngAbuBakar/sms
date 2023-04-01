package com.stockManagementSystem.sms.service;

import com.stockManagementSystem.sms.Repository.StockRepository;
import com.stockManagementSystem.sms.Entity.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class StockService {
    @Autowired
    StockRepository stockRepository;

    @Transactional
    public boolean isInStock(String skuCode)
    {
       return stockRepository.findByskuCode().isPresent();

    }

}
