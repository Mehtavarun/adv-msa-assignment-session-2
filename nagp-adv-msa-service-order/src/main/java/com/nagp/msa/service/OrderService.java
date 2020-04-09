package com.nagp.msa.service;

import java.util.List;

import com.nagp.msa.entity.Order;

public interface OrderService {
    /**
     * fetches the orders
     * 
     * @return orders
     */
    List<Order> getOrders();
}
