package com.stockManagementSystem.sms.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "product_type")
@Data
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "product_type")
    public String type;
    @OneToMany(mappedBy = "productType")
    private List<Product> productList;
}
