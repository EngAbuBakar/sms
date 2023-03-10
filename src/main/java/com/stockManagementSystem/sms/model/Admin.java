package com.stockManagementSystem.sms.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "user")
public class Admin {
    @Id
    @Column
    private String adminId;
    @Column
    private String adminName;
    @Column
    private String adminEmail;
    @Column
    private String adminAdress;
    @OneToMany
    @JoinColumn (name="productId")
    private Product product;
}
