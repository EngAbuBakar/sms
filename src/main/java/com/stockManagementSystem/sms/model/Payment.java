package com.stockManagementSystem.sms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "transaction")
public class Payment {
    @Id
    @Column
    private String PaymentId;
    @Column
    private String PaymentType;
    @Column
    private String PaymentDetail;

}
