package com.yc.web.servlet.good;

import com.yc.domain.Good;
import com.yc.domain.Merchant;
import com.yc.service.GoodService;
import com.yc.service.impl.GoodServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@WebServlet( "/goodByNameServlet")
public class GoodByNameServlet extends HttpServlet {
    private GoodService goodService=new GoodServiceImpl();
    private boolean flag=false;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name");
        String decode = "";
        try {
            decode = java.net.URLDecoder.decode(name, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("检测是否重名:"+decode);
        HttpSession session = request.getSession();
        Merchant user = (Merchant) session.getAttribute("user");
        Integer merId=user.getId();
        Good good = goodService.getByName(decode,merId);
        if(good!=null){
            flag=true;
            System.out.println(flag);
            response.getWriter().write(""+flag);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
