package com.stockManagementSystem.sms.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "stock")
public class Stock {
    @Id
    @Column(name = "stock_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "st_quantity")
    private Long quantity;
    @ManyToOne
    @JoinColumn(name = "product_Id")
    private Product product;



}
