package com.stockManagementSystem.sms.Repository;

import com.stockManagementSystem.sms.Entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {

   // ThreadLocal<Object> findById(Long id);
}
