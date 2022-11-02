package com.yc.web.servlet.good;

import com.yc.domain.Good;
import com.yc.domain.Merchant;
import com.yc.service.GoodService;
import com.yc.service.impl.GoodServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/gooByIdServlet")
public class GooByIdServlet extends HttpServlet {

    private GoodService goodService=new GoodServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Good good = goodService.getById(Integer.valueOf(id));
        request.setAttribute("good",good);
        request.getRequestDispatcher("GoodUpdate.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
