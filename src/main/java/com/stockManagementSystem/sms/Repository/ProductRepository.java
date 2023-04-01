package com.stockManagementSystem.sms.Repository;

import com.stockManagementSystem.sms.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public  interface ProductRepository extends JpaRepository<Product ,Long>{

}
/*
public interface ProductRepository extends CrudRepository<Product,Long> {
    Product findAll(Long Id);
    Product findCountryById(long Id);
    Product findCountryByName(String countryTitle);
}

 */
