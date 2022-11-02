package com.yc.web.servlet.good;

import com.yc.domain.Merchant;
import com.yc.service.GoodService;
import com.yc.service.impl.GoodServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/goodDeleteByIdServlet")
public class GoodDeleteByIdServlet extends HttpServlet {
    private GoodService goodService =new GoodServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        boolean flag = goodService.deleteById(Integer.parseInt(id));
        if(flag){
            request.getRequestDispatcher("goodsAllServlet").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
