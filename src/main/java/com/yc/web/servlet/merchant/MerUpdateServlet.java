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

@WebServlet("/merUpdateServlet")
public class MerUpdateServlet extends HttpServlet {
    private MerchantService merchantService=new MerchantServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String description = request.getParameter("description");
        System.out.println(id+name+phone+description);
        Merchant merchant=merchantService.getById(Integer.parseInt(id));
        merchant.setPhone(phone);
        merchant.setName(name);
        merchant.setDescription(description);
        System.out.println(merchant);
        merchantService.update(merchant);

        request.getRequestDispatcher("merAllServlet").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
