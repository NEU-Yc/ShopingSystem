package com.yc.web.servlet.common;


import com.yc.domain.Merchant;
import com.yc.service.MerchantService;
import com.yc.service.impl.MerchantServiceImpl;
import com.yc.util.MD5Utils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    private MerchantService merchantService=new MerchantServiceImpl();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String md5Password= MD5Utils.string2MD5(password);
        String remember = request.getParameter("remember");
        String identity = request.getParameter("identity");
        if("manager".equals(identity)){
            //如果是管理员
            Merchant merchant = merchantService.getById(1);
            if(merchant!=null&&"admin".equals(username)){
                if(md5Password.equals(merchant.getPassword())){
                    //登陆成功
                    if("1".equals(remember)){
                        Cookie c_username=new Cookie("username",username);
                        Cookie c_password=new Cookie("password",password);

                        c_username.setMaxAge(60*60*7*24);//一周
                        c_password.setMaxAge(60*60*7*24);

                        response.addCookie(c_password);
                        response.addCookie(c_username);
                    }
                    HttpSession session=request.getSession();
                    session.setAttribute("user",merchant);
                    request.getRequestDispatcher("AdminIndex.jsp").forward(request,response);

                }else{
                    request.setAttribute("login_msg","密码错误");
                    request.getRequestDispatcher("login.jsp").forward(request,response);
                }
            }else{
                request.setAttribute("login_msg","用户名不存在");
                request.getRequestDispatcher("login.jsp").forward(request,response);
            }
        }else if("merchant".equals(identity)){
            //如果是商家
            Merchant merchant = merchantService.getByUserName(username);
            if(merchant!=null&&!("admin".equals(merchant.getUserName()))){
                if(md5Password.equals(merchant.getPassword())){
                    //登陆成功
                    if("1".equals(remember)){
                        Cookie c_username=new Cookie("username",username);
                        Cookie c_password=new Cookie("password",password);

                        c_username.setMaxAge(60*60*7*24);//一周
                        c_password.setMaxAge(60*60*7*24);

                        response.addCookie(c_password);
                        response.addCookie(c_username);
                    }
                    HttpSession session=request.getSession();
                    session.setAttribute("user",merchant);
                    request.getRequestDispatcher("MerIndex.jsp").forward(request,response);
                }else{
                    request.setAttribute("login_msg","用户名或密码错误");
                    request.getRequestDispatcher("/login.jsp").forward(request,response);
                }
            }else{
                request.setAttribute("login_msg","用户名不存在");
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
