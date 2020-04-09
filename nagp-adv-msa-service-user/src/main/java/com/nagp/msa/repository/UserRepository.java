package com.nagp.msa.repository;

import org.springframework.data.repository.CrudRepository;

import com.nagp.msa.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
