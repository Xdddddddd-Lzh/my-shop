package com.liang.my.shop.web.admin.dao.Impl;

import com.liang.my.shop.domain.User;
import com.liang.my.shop.web.admin.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.swing.*;

@Repository
public class UserDaoImpl implements UserDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    public User getUser(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setUsername("梁兆辉");
        return user;
    }
}
