package com.stockManagementSystem.sms.Model;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CustomerDetailModel {
    private Long customerId;
    private String customerName;
    private String customerAdress;
    private String customerContact;
}
