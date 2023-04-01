package com.stockManagementSystem.sms.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Entity
@Builder
@Data
@Table(name = "t_products")
public class Product {
    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_Id")
    private Long Id;
    @Column(name = "product_title")
    private String productTitle;
    @Column(name = "product_desc")
    private String productDesc;
    @Column(name = " produc_type")
    private String producType;

    @Column(name = "p_price")
    private double price;
   /* @OneToOne
    @JoinColumn(name = "stock_id")
    private Stock stock;

    @OneToMany(mappedBy="")
    List<Order> productSaleList;

    */


}
