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

@WebServlet("/goodsAllServlet")
public class GoodsAllServlet extends HttpServlet {
    private GoodService goodService=new GoodServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("/goodsAllServlet");
        //1. goodService
        HttpSession session = request.getSession();
        Merchant user = (Merchant) session.getAttribute("user");
        Integer merId=user.getId();
        System.out.println("id:"+merId);
        List<Good> goods = goodService.getList(merId);
        System.out.println(goods);
        //2. 存入request域中
        request.setAttribute("goods",goods);
        response.setContentType("index/jsp;utf-8");
        //3. 转发到Good.jsp
        request.getRequestDispatcher("/Good.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
