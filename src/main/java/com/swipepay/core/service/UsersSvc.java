package com.swipepay.core.service;

import com.swipepay.core.dto.UsersDto;
import com.swipepay.core.model.Users;

import java.util.List;

public interface UsersSvc {
    Users save(Users user);
    List<Users> findAll();
    void delete(long id);
//    Users findOne();
//    public String getPassword(String username);
}
