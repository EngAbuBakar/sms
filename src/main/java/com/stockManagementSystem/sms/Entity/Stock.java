package com.stockManagementSystem.sms.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Stock {
    @Id
    @Column
    private Long stockID;
    @Column
    private String stockType;
    @Column
    private String stockDetail;
    @OneToOne
    private Product product;

}
