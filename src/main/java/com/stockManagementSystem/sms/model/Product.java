package com.stockManagementSystem.sms.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @Column
    private String productID;
    @Column
    private String productTitle;
    @Column
    private String productDesc;
    @Column
    private String producType;
    @ManyToOne @JoinColumn (name="adminId")
    private List <Admin>productList;

    @OneToMany @JoinColumn (name="stockId")
    private Stock stock;
}
