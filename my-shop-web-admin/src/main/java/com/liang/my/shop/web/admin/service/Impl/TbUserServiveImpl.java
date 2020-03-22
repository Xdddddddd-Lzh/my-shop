package com.liang.my.shop.web.admin.service.Impl;

import com.liang.my.shop.domain.TbUser;
import com.liang.my.shop.web.admin.dao.TbUserDao;
import com.liang.my.shop.web.admin.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbUserServiveImpl implements TbUserService {

    @Autowired
    private TbUserDao tbUserDao;

    public List<TbUser> selectAll() {
        return tbUserDao.selectAll();
    }
}
