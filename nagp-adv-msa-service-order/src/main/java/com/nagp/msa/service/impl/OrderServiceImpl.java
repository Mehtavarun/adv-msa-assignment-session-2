package com.nagp.msa.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagp.msa.entity.Order;
import com.nagp.msa.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1l, 234.45, new Date(4004444444l)));
        orders.add(new Order(2l, 1534.45, new Date(6664722222l)));
        return orders;
    }

}
