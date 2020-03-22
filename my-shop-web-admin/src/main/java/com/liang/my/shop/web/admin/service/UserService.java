package com.liang.my.shop.web.admin.service;


import com.liang.my.shop.domain.User;

public interface UserService {
    public User login(String email , String password);
}
