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

@WebServlet("/merByNameServlet")
public class MerByNameServlet extends HttpServlet {
    private MerchantService merchantService=new MerchantServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        name="%"+name+"%";
        System.out.println(name);
        List<Merchant> merchants = merchantService.getByName(name);
        System.out.println(merchants);
        //2. 存入request域中
        request.setAttribute("merchants",merchants);
        response.setContentType("index/jsp;utf-8");
        //3. 转发到Merchant.jsp
        request.getRequestDispatcher("/Merchant.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

}
