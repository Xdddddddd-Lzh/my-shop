package com.liang.my.shop.web.admin.test;

import com.liang.my.shop.domain.TbUser;
import com.liang.my.shop.web.admin.service.TbUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml" , "classpath:applicationContext-druid.xml" , "classpath:applicationContext-mybatis.xml"})
public class TbUserServiceTest {

    @Autowired
    private TbUserService tbUserService;

    @Test
    public void tbUserServiceTest(){
        List<TbUser> tbUsers = tbUserService.selectAll();
        for(TbUser tbUser : tbUsers){
            System.out.println(tbUser.getUsername());
        }
    }
}
