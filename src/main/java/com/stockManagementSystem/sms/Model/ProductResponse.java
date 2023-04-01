package com.stockManagementSystem.sms.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponse {
    private long Id;
    private String productTitle;
    private String productDesc;
    private String producType;
    double price;
}
