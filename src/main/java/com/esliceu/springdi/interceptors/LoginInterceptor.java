package com.esliceu.springdi.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object logged = session.getAttribute("logged");
        if (logged == null){
            //response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            response.sendRedirect("/hello");
            return false;
        }
        return true;
    }
}
