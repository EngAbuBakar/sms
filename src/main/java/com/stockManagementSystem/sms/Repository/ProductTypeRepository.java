package com.stockManagementSystem.sms.Repository;

import com.stockManagementSystem.sms.Entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends JpaRepository <ProductType,Long>{



}
