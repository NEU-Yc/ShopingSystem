package com.yc.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req= (HttpServletRequest) request;
        String[] urls={"/login.jsp","/css/","/imgs/","loginServlet","register.jsp","registerServlet","checkCodeServlet","merByUsernameServlet"};
        String url = req.getRequestURI();
        for (String s : urls) {
            if(url.contains(s)){
                chain.doFilter(request,response);
                return;
            }
        }
        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");
        if(user!=null){
            chain.doFilter(request, response);
        }else{
            req.setAttribute("login_msg","请您先登录！");
            req.getRequestDispatcher("login.jsp").forward(req,response);
        }

    }
}
