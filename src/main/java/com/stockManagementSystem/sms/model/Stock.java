package com.stockManagementSystem.sms.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Stock {
    @Id
    @Column
    private String stockID;
    @Column
    private String stockType;
    @Column
    private String stockDetail;
    @ManyToOne
    @JoinColumn(name="productId")
    private List<Product> productStock;

}
