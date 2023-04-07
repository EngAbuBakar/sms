package com.stockManagementSystem.sms.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "t_order")
public class Order {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "order_no")
    private String orderNumer;
    @OneToMany(mappedBy = "order")
    private List<OrderLineItems> orderLineItems;
}
