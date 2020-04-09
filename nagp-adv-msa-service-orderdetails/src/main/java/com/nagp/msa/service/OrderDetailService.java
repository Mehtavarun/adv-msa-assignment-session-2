package com.nagp.msa.service;

import com.nagp.msa.entity.OrderDetails;

public interface OrderDetailService {
    /**
     * fetches the orderDetails from User service and Order service
     * 
     * @param id
     * 
     * @return orderDetails
     */
    OrderDetails getOrderDetails(Long id);
}
