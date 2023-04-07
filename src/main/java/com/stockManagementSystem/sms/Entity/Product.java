package com.stockManagementSystem.sms.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Builder
@Data
@Table(name = "t_products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_Id")
    private Long Id;
    @Column(name = "product_title")
    private String productTitle;
    @Column(name = "product_desc")
    private String productDesc;

    @Column(name = "p_price")
    private double price;
    @ManyToOne
    @JoinColumn(name = "type_id")
    private ProductType productType;
/*
    @OneToMany(mappedBy="")
    List<Order> productSaleList;

    */


}
