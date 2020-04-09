package com.nagp.msa.service;

import com.nagp.msa.entity.User;

public interface UserService {
    /**
     * fetches the user
     * @param id 
     * 
     * @return user
     */
    User getUser(Integer id);
}
