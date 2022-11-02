package com.yc.web.servlet.common;

import com.yc.domain.Merchant;
import com.yc.service.MerchantService;
import com.yc.service.impl.MerchantServiceImpl;
import com.yc.util.MD5Utils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {

    private MerchantService merchantService=new MerchantServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        password= MD5Utils.string2MD5(password);
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        Merchant merchant=new Merchant(username,password,name,phone);
        System.out.println("接收到注册：");
        System.out.println(merchant);
        String checkCode = request.getParameter("checkCode");
        HttpSession session = request.getSession();
        String checkCodeGen = (String) session.getAttribute("checkCode");
        if(!checkCodeGen.equalsIgnoreCase(checkCode)){
            request.setAttribute("code_msg","验证码不正确！");
            request.getRequestDispatcher("register.jsp").forward(request,response);
            return;
        }

        if(merchantService.addMerchant(merchant)){
            request.setAttribute("register_msg","注册成功，请登录！");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }else{
            request.setAttribute("register_msg","用户名已被使用！");
            request.getRequestDispatcher("register.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
