package com.stockManagementSystem.sms.Repository;

import com.stockManagementSystem.sms.Entity.Product;
import com.stockManagementSystem.sms.Model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public  interface ProductRepository extends JpaRepository<Product ,Long>{
    List<Product> findProductByProductTitle(String title);
    List<ProductModel> findProductsByCategoryId(Long categoryId);

    List<Product> findByCategoryId(Long categoryId);


/*public interface ProductRepository extends CrudRepository<Product,Long> {
    Product findAll(Long Id);
    Product findCountryById(long Id);
    Product findCountryByName(String countryTitle);

 */
}


