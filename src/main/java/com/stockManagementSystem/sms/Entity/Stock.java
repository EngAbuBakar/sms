package com.stockManagementSystem.sms.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "t_stock")
public class Stock {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "sku_code")
    private String skuCode;
    @Column(name = "st_quantity")
    private int quantity;


}
