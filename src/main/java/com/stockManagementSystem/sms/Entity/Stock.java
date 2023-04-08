package com.stockManagementSystem.sms.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "t_stock")
public class Stock {
    @Id
    @Column(name = "stock_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "st_quantity")
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "product_Id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private ProductType productType;



}
