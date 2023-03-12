package com.stockManagementSystem.sms.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productId")
    private Long productID;
    @Column
    private String productTitle;
    @Column
    private String productDesc;
    @Column
    private String producType;

    @Column double price;
    @OneToOne
    private Stock stock;

    @OneToMany
    List<ProductSale> productSaleList;
}
