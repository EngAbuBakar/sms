package com.stockManagementSystem.sms.Repository;

import com.stockManagementSystem.sms.Entity.Stock;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StockRepository extends CrudRepository<Stock,Long> {

    Optional<Stock> findByskuCode();
}
