package com.nagp.msa.service.impl;

import java.util.List;

import javax.xml.ws.http.HTTPException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagp.msa.entity.Order;
import com.nagp.msa.entity.OrderDetails;
import com.nagp.msa.entity.User;
import com.nagp.msa.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service.user}")
    private String baseUserServiceUrl;

    @Value("${service.order}")
    private String baseOrderServiceUrl;

    @Override
    public OrderDetails getOrderDetails(Long id) {
        return new OrderDetails(getUserDetails(), getOrders());
    }

    private List<Order> getOrders() {
        String requestUrl = baseOrderServiceUrl + "/orders";
        ParameterizedTypeReference<List<Order>> responseType = new ParameterizedTypeReference<List<Order>>() {
        };
        ResponseEntity<List<Order>> response = restTemplate.exchange(requestUrl, HttpMethod.GET, null, responseType);
        if (response.getStatusCode().value() != 200) {
            throw new HTTPException(500);
        }
        return response.getBody();
    }

    private User getUserDetails() {
        String requestUrl = baseUserServiceUrl + "/user/1";
        ParameterizedTypeReference<User> responseType = new ParameterizedTypeReference<User>() {
        };
        ResponseEntity<User> response = restTemplate.exchange(requestUrl, HttpMethod.GET, null, responseType);
        if (response.getStatusCode().value() != 200) {
            throw new HTTPException(500);
        }
        return response.getBody();
    }

}
