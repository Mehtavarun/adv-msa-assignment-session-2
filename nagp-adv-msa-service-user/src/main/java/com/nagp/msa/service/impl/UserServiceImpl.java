package com.nagp.msa.service.impl;

import javax.xml.ws.http.HTTPException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nagp.msa.entity.User;
import com.nagp.msa.repository.UserRepository;
import com.nagp.msa.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Value("${spring.datasource.url}")
    private String url;

    @Override
    public User getUser(Integer id) {
        System.out.println(url);
        return userRepository.findById(1l).orElseThrow(() -> new HTTPException(404));
    }
}
