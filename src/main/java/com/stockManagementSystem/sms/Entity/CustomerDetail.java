package com.stockManagementSystem.sms.Entity;

import jakarta.persistence.*;

import java.util.List;
@Entity @Table(name ="CustomerDetail" )
public class CustomerDetail {
        @Id
    @Column(name = "customerId")
    private Long customerId;
    @Column
    private String customerName;
    @Column
    private String customerAdress;
    @Column
    private String customerContact;
    @OneToMany

    private List<ProductSale> productSaleList;


}
