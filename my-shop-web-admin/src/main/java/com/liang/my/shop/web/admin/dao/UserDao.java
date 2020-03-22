package com.liang.my.shop.web.admin.dao;

import com.liang.my.shop.domain.User;

import javax.swing.*;

public interface UserDao {
    public User getUser(String email , String password);
}
