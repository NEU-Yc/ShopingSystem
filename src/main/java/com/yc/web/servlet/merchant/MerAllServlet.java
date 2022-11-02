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
import java.util.List;

@WebServlet("/merAllServlet")
public class MerAllServlet extends HttpServlet {

    private MerchantService merchantService=new MerchantServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 调用merchantService完成查询
        List<Merchant> merchants = merchantService.getList();
        System.out.println(merchants);
        //2. 存入request域中
        request.setAttribute("merchants",merchants);
        response.setContentType("index/jsp;utf-8");
        //3. 转发到Merchant.jsp
        request.getRequestDispatcher("/Merchant.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

}
