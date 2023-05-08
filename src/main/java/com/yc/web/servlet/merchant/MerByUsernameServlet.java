package com.yc.web.servlet.merchant;

import com.yc.domain.Merchant;
import com.yc.service.MerchantService;
import com.yc.service.impl.MerchantServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/merByUsernameServlet")
public class MerByUsernameServlet extends HttpServlet {
    private MerchantService merchantService=new MerchantServiceImpl();
    private boolean flag;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        Merchant merchant = merchantService.getByUserName(username);
        System.out.println("检测是否重名:"+merchant);
        if(merchant!=null){
            flag=true;
            response.getWriter().write(""+flag);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
