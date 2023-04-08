package com.stockManagementSystem.sms.Model;

import com.stockManagementSystem.sms.Entity.Product;
import com.stockManagementSystem.sms.Entity.ProductType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductTypeModel {
    private long id;
    private String type;

    public ProductTypeModel(ProductType productType) {
       // Product product = new Product();
        this.setId(productType.getId());
        this.setType(productType.getType());
    }


    public ProductTypeModel assemble(ProductType productType) {
        ProductTypeModel productTypeModel = new ProductTypeModel(productType);
        productTypeModel.setId(productType.getId());
        productTypeModel.setType(productType.getType());
        return productTypeModel;

    }

    public ProductType dissamble() {
        ProductType productType = new ProductType();

        productType.setId(id);
        productType.setType(type);
        return productType;
    }
}
