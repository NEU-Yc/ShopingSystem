/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-05-31 14:49:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MerIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>商家后台管理</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"layui/css/layui.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"layui-layout-body\" style=\"background-image: url(imgs/bg.jpg); background-size: cover;\">\r\n");
      out.write("<div class=\"layui-layout layui-layout-admin\" style=\"opacity: 0.80;\">\r\n");
      out.write("    <div class=\"layui-header layui-bg-black\">\r\n");
      out.write("        <div class=\"layui-logo\" style=\"background-image: url(imgs/firework.gif);background-size: cover;\"></div>\r\n");
      out.write("        <!-- 头部区域（可配合layui已有的水平导航） -->\r\n");
      out.write("        <ul class=\"layui-nav layui-layout-left\">\r\n");
      out.write("            <li class=\"layui-nav-item\" style=\"font-size: 25px;font-style: italic;\"><i class=\"layui-icon layui-icon-util\" style=\"font-size: 25px;\"></i>商品信息管理系统</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul class=\"layui-nav layui-layout-right\">\r\n");
      out.write("            <li class=\"layui-nav-item\" style=\"font-size: 20px;\"><i class=\"layui-icon layui-icon-username\" style=\"font-size: 20px;\">&nbsp;</i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</li>\r\n");
      out.write("            <li class=\"layui-nav-item\"><a href=\"logoutServlet\" style=\"font-size: 17px;\"><i class=\"layui-icon layui-icon-logout\" style=\"font-size: 18px;\"></i>&nbsp;退出</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"layui-side layui-bg-black\">\r\n");
      out.write("        <div class=\"layui-side-scroll\">\r\n");
      out.write("            <ur class=\"layui-nav layui-nav-tree\"  lay-filter=\"test\">\r\n");
      out.write("                <li class=\"layui-nav-item layui-nav-itemed\"><p style=\"font-size: 21px;\">&nbsp;<i class=\"layui-icon layui-icon-set layui-anim layui-anim-rotate layui-anim-loop\" style=\"font-size: 25px;\"></i>基本功能</p></li>\r\n");
      out.write("                <li class=\"layui-nav-item layui-nav-itemed\"><a href=\"goodsAllServlet\" style=\"font-size: 20px;\" target=\"main_self_frame\">&nbsp;&nbsp;&nbsp;<i class=\"layui-icon layui-icon-friends\" style=\"font-size: 20px;\"></i>&nbsp;&nbsp;商品管理</a></li>\r\n");
      out.write("            </ur>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-body\">\r\n");
      out.write("        <iframe src=\"main.html\" name=\"main_self_frame\" frameborder=\"0\" class=\"layadmin-iframe\" width=\"100%\" height=\"100%\" style=\"background-color: white;\">A</iframe>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"layui/layui.js\"></script>\r\n");
      out.write("<script src=\"layui/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    //JavaScript代码区域\r\n");
      out.write("    layui.use(['element', 'layer'], function(){\r\n");
      out.write("        var element = layui.element;\r\n");
      out.write("        var layer = layui.layer;\r\n");
      out.write("        layer.msg('欢迎来到后台管理界面！');\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
