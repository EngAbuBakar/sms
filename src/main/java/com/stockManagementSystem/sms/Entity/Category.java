package com.stockManagementSystem.sms.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "product_category")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private long id;
    @Column(name = "pro_category")
    public String type;
    @OneToMany(mappedBy = "category")
    private List<Product>  productList;

}
