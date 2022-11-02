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

@WebServlet("/merDeleteByIdServlet")
public class MerDeleteByIdServlet extends HttpServlet {
    private MerchantService merchantService=new MerchantServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        boolean flag = merchantService.deleteById(Integer.parseInt(id));

        response.getWriter().write(""+flag);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
