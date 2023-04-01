package com.stockManagementSystem.sms.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderLineItemsModel {
    private long id;
    private String skuCode;
    private double price;
    private String quantity;

    public OrderLineItemsModel(long id,String skuCode,double price,String quantity)
    {
        this.id=id;
        this.price=price;
        this.quantity=quantity;
        this.skuCode=skuCode;
    }

}
