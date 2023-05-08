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
import java.util.List;

@WebServlet( "/goodSearchNameServlet")
public class GoodSearchNameServlet extends HttpServlet {
    private GoodService goodService=new GoodServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name");
        try {
            name = java.net.URLDecoder.decode(name, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        name="%"+name+"%";
        System.out.println(name);
        HttpSession session = request.getSession();
        Merchant user = (Merchant) session.getAttribute("user");
        Integer merId=user.getId();
        List<Good> goods = goodService.searchByName(name,merId);
        System.out.println(goods);
        //2. 存入request域中
        request.setAttribute("goods",goods);
        response.setContentType("index/jsp;utf-8");
        //3. 转发到Good.jsp
        request.getRequestDispatcher("/Good.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
