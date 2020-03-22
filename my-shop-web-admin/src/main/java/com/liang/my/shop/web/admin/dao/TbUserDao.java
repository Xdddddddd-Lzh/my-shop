package com.liang.my.shop.web.admin.dao;

import com.liang.my.shop.domain.TbUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbUserDao {
    public List<TbUser> selectAll();
}
