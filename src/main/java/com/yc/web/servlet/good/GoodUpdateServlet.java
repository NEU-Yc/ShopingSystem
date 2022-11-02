package com.yc.web.servlet.good;

import com.yc.dao.good.GoodDao;
import com.yc.domain.Good;
import com.yc.domain.Merchant;
import com.yc.service.GoodService;
import com.yc.service.impl.GoodServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet( "/goodUpdateServlet")
public class GoodUpdateServlet extends HttpServlet {
    private GoodService goodService =new GoodServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String inventory = request.getParameter("inventory");
        String description = request.getParameter("description");
        System.out.println(id+name+price+description);
        Good good=goodService.getById(Integer.parseInt(id));
        System.out.println("修改前"+good);
        good.setName(name);
        good.setPrice(Integer.valueOf(price));
        good.setInventory(Integer.valueOf(inventory));
        good.setDescription(description);
        System.out.println("修改后"+good);
        goodService.update(good);

        request.getRequestDispatcher("goodsAllServlet").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
