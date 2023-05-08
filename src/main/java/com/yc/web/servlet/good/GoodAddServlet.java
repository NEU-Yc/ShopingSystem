package com.yc.web.servlet.good;

import com.yc.domain.Good;
import com.yc.domain.Merchant;
import com.yc.service.GoodService;
import com.yc.service.impl.GoodServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/goodAddServlet")
public class GoodAddServlet extends HttpServlet {
    private GoodService goodService=new GoodServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. goodService
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String inventory = request.getParameter("inventory");
        String description = request.getParameter("description");
        HttpSession session = request.getSession();
        Merchant user = (Merchant) session.getAttribute("user");
        Integer merId=user.getId();
        if(price==""){
            System.out.println("空字符串?");
            price="0";
        }
        if(inventory==""){
            inventory="0";
        }
        System.out.println(name +price+inventory+description);
        Good good=new Good(merId,name,Integer.valueOf(price),Integer.valueOf(inventory),description);

        System.out.println("准备添加的good:"+good);
        goodService.addGood(good);

        request.getRequestDispatcher("goodsAllServlet").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
