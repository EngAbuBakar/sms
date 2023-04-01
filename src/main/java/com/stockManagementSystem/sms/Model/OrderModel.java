package com.stockManagementSystem.sms.Model;

import lombok.Data;

@Data
public class OrderModel {
    private Long Id;
    private int quantity;

    private double totalAmount;
     double discoutAmount;
    private String orderNumer;


    public OrderModel(long Id, int quantity,String orderNumer, double totalAmount, double discoutAmount){
        this.Id=Id;
        this.quantity=quantity;
        this.orderNumer=orderNumer;
        this.totalAmount=totalAmount;
        this.discoutAmount=discoutAmount;

    }


}
