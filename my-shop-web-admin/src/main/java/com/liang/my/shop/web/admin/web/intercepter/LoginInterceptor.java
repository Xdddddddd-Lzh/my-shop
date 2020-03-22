package com.liang.my.shop.web.admin.web.intercepter;

import com.liang.my.shop.commons.constants.ConstantUtils;
import com.liang.my.shop.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
        System.out.println("进去登录拦截器");
        User user = (User) httpServletRequest.getSession().getAttribute(ConstantUtils.SESSION_USER);

        if(user == null){
           httpServletResponse.sendRedirect("/login");
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
