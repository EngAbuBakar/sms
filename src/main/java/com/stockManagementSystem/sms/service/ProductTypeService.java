package com.stockManagementSystem.sms.service;

import com.stockManagementSystem.sms.Entity.ProductType;
import com.stockManagementSystem.sms.Model.ProductModel;
import com.stockManagementSystem.sms.Model.ProductTypeModel;
import com.stockManagementSystem.sms.Repository.ProductTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeService {
    @Autowired
    ProductTypeRepository productTypeRepository;
    public ProductTypeModel saveProductType(ProductTypeModel productType)
    {
        return productType.assemble(productTypeRepository.save(productType.dissamble()));

    }

}
