package com.liang.my.shop.web.admin.web.intercepter;

import com.liang.my.shop.commons.constants.ConstantUtils;
import com.liang.my.shop.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PermissionInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("进去权限拦截器");
        if(modelAndView.getViewName().endsWith("login")){
            User user = (User) httpServletRequest.getSession().getAttribute(ConstantUtils.SESSION_USER);
            if(user != null){
                httpServletResponse.sendRedirect("/main");
            }
        }
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
