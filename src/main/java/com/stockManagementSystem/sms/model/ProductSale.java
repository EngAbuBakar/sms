package com.stockManagementSystem.sms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "products_sale")
public class ProductSale {

    @Id
    @Column
    private String productSaleId;
    @Column
    private String productSaleType;
    @Column
    private String productSaleDesc;

}
