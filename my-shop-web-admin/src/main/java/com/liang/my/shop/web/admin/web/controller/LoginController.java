package com.liang.my.shop.web.admin.web.controller;

import com.liang.my.shop.commons.constants.ConstantUtils;
import com.liang.my.shop.domain.User;
import com.liang.my.shop.web.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 返回login页面
     * @return
     */
    @RequestMapping(value = {"" , "login"} , method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "login" , method = RequestMethod.POST)
    public String login(@RequestParam(required = true) String email ,@RequestParam(required = true) String password , HttpServletRequest httpServletRequest){
        System.out.println("我丢阿");
        User user = userService.login(email, password);

        if(user == null){
            return login();
        }else{
            httpServletRequest.getSession().setAttribute(ConstantUtils.SESSION_USER,user);
        }

        return "redirect:/main";
    }

    @RequestMapping(value = "logout" , method = RequestMethod.GET)
    public String logout(HttpServletRequest httpServletRequest){
        httpServletRequest.getSession().invalidate();
        return login();
    }
}
