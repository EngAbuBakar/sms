package com.stockManagementSystem.sms.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "products_sale")
public class ProductSale {
    @Id
    @Column
    private Long productSaleId;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    @Column
    private int quantity;
    @Column
    private double totalAmount;
    @Column double discoutAmount;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private CustomerDetail customerDetails;



}
