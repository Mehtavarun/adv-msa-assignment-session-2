package com.nagp.msa.entity;

import java.util.List;

public class OrderDetails {

    private User userDetails;
    private List<Order> orders;

    public User getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(User userDetails) {
        this.userDetails = userDetails;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public OrderDetails() {
    };

    public OrderDetails(User userDetails, List<Order> orders) {
        this.userDetails = userDetails;
        this.orders = orders;
    }
}
