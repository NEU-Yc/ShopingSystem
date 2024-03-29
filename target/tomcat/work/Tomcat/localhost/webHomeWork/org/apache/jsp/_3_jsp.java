/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-05-22 11:08:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>学生信息添加</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"layui/css/layui.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form class=\"layui-form\">\r\n");
      out.write("    <div class=\"layui-card-body\">\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <label class=\"layui-form-label\">学生姓名：</label>\r\n");
      out.write("            <div class=\"layui-input-block\">\r\n");
      out.write("                <input type=\"text\" class=\"layui-input\" id=\"name\" lay-verify=\"required\" name=\"name\" lay-verType=\"tips\" lay-reqText=\"请输入学生姓名！\" style=\" width: 50%;border-color: dodgerblue;\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <label class=\"layui-form-label\">学生性别：</label>\r\n");
      out.write("            <div class=\"layui-input-block\">\r\n");
      out.write("                <input type=\"radio\" name=\"sex\" value=\"男\" title=\"男\" checked>\r\n");
      out.write("                <input type=\"radio\" name=\"sex\" value=\"女\" title=\"女\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <label class=\"layui-form-label\">出生年月：</label>\r\n");
      out.write("            <div class=\"layui-input-block\">\r\n");
      out.write("                <input type=\"date\" class=\"layui-input\" id=\"birthday\" lay-verify=\"required\" name=\"birthday\" lay-verType=\"tips\" lay-reqText=\"请输入学生出生年月！\" style=\" width: 50%;border-color: dodgerblue;\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <label class=\"layui-form-label\">学生手机：</label>\r\n");
      out.write("            <div class=\"layui-input-block\">\r\n");
      out.write("                <input type=\"text\" class=\"layui-input\" id=\"mobile\" lay-verify=\"required\" name=\"mobile\" lay-verType=\"tips\" lay-reqText=\"请输入学生手机！\" style=\"border-color: dodgerblue;\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <label class=\"layui-form-label\">学生邮箱：</label>\r\n");
      out.write("            <div class=\"layui-input-block\">\r\n");
      out.write("                <input type=\"text\" class=\"layui-input\" id=\"email\" lay-verify=\"required\" name=\"email\" lay-verType=\"tips\" lay-reqText=\"请输入学生邮箱！\" style=\"border-color: dodgerblue;\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <hr class=\"layui-bg-blue\">\r\n");
      out.write("        <div class=\"layui-input-item\">\r\n");
      out.write("            <label class=\"layui-form-label\" style=\"color: dodgerblue; \">学生班级：</label>\r\n");
      out.write("            <div class=\"layui-input-block\">\r\n");
      out.write("                <select name=\"clazzName\" id=\"clazzName\" lay-verify=\"required\">\r\n");
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"layui-input-item\">\r\n");
      out.write("            <label class=\"layui-form-label\" style=\"color: dodgerblue;\">学生导师：</label>\r\n");
      out.write("            <div class=\"layui-input-block\">\r\n");
      out.write("                <select name=\"teacherName\" id=\"teacherName\" lay-verify=\"required\">\r\n");
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item layui-hide\">\r\n");
      out.write("            <button type=\"button\" lay-submit=\"\" lay-filter=\"user-add-save\" id=\"user-add-save\" class=\"layui-btn\">\r\n");
      out.write("                确认\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("<script src=\"layui/layui.all.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    layui.use('form', function(){\r\n");
      out.write("        var form = layui.form;\r\n");
      out.write("        const $ = layui.$;\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: '/ClazzsAllName',\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("                data = data.data;\r\n");
      out.write("                $.each(data, function (index, item) {\r\n");
      out.write("                    $('#clazzName').append(new Option(item.name, item.name));\r\n");
      out.write("                });\r\n");
      out.write("                form.render('select');\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: '/TeachersAllName',\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("                data = data.data;\r\n");
      out.write("                $.each(data, function (index, item) {\r\n");
      out.write("                    $('#teacherName').append(new Option(item.name, item.name));\r\n");
      out.write("                });\r\n");
      out.write("                form.render('select');\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
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
