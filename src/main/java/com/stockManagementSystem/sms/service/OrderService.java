package com.stockManagementSystem.sms.service;

import com.stockManagementSystem.sms.Entity.Order;
import com.stockManagementSystem.sms.Entity.OrderLineItems;
import com.stockManagementSystem.sms.Model.OrderLineItemsModel;
import com.stockManagementSystem.sms.Model.OrderRequest;
import com.stockManagementSystem.sms.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    public void placeOrder(OrderRequest orderRequest)
 {
   Order order=new Order();
   order.setOrderNumer(UUID.randomUUID().toString());
     List<OrderLineItems> orderLineItems = orderRequest.getOrderRequestList()
             .stream()
             .map(this::mapToDto).toList();

     List<OrderLineItems> orderLineItem;
     order.setOrderLineItems(orderLineItems);
     orderRepository.save(order);

 }

    private OrderLineItems mapToDto(OrderLineItemsModel orderLineItemsModel) {
     OrderLineItems orderLineItems=new OrderLineItems();
     orderLineItems.setId(orderLineItemsModel.getId());
     orderLineItems.setSkuCode(orderLineItemsModel.getSkuCode());
     orderLineItems.setPrice(orderLineItemsModel.getPrice());
     orderLineItems.setQuantity(orderLineItemsModel.getQuantity());
     return orderLineItems;
    }

}
