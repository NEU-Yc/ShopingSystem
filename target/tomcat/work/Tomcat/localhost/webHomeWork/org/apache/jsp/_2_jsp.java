/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-05-22 11:06:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>学生信息管理界面</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"layui/css/layui.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");
      out.write("<center><p style=\"color: black; font-size: 30px;\">学生信息管理</p></center>\r\n");
      out.write("\r\n");
      out.write("<table class=\"layui-hide\" id=\"test\" lay-filter=\"demo\"></table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"layui/layui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/html\" id=\"toolbarDemo\">\r\n");
      out.write("    <div class=\"layui-btn-container layui-inline\">\r\n");
      out.write("        <button class=\"layui-btn layui-btn-normal\" lay-event=\"add\"><i class=\"layui-icon layui-icon-add-1\"></i>添加</button>\r\n");
      out.write("        <button class=\"layui-btn layui-btn-danger\" lay-event=\"del\"><i class=\"layui-icon layui-icon-delete\"></i>删除</button>\r\n");
      out.write("        <button class=\"layui-btn layui-btn-warm\" lay-event=\"refreshTable\"><i class=\"layui-icon layui-icon-refresh-1\"></i>刷新</button>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-inline\">\r\n");
      out.write("        <div class=\"layui-input-inline\">\r\n");
      out.write("            <input type=\"text\" class=\"layui-input\" id=\"info\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <button class=\"layui-btn\" lay-event=\"search\" style=\"background-image: url('imgs/firework.gif'); background-size: cover;\"><i class=\"layui-icon layui-icon-search\"></i>搜索</button>\r\n");
      out.write("    </div>\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/html\" id=\"barDemo\">\r\n");
      out.write("    <a class=\"layui-btn layui-btn-primary layui-btn-xs layui-btn-radius\" lay-event=\"detail\"><i class=\"layui-icon layui-icon-search\"></i>查看</a>\r\n");
      out.write("    <a class=\"layui-btn layui-btn-xs layui-btn-radius\" lay-event=\"edit\"><i class=\"layui-icon layui-icon-list\"></i>编辑</a>\r\n");
      out.write("    <a class=\"layui-btn layui-btn-danger layui-btn-xs layui-btn-radius\" lay-event=\"del\"><i class=\"layui-icon layui-icon-delete\"></i>删除</a>\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("    layui.use(['table', 'layer', 'form'], function(){\r\n");
      out.write("        var layer = layui.layer;\r\n");
      out.write("        var table = layui.table;\r\n");
      out.write("        const $ = layui.$;\r\n");
      out.write("\r\n");
      out.write("        const tableIns = table.render({\r\n");
      out.write("            text:{none: '无数据，请刷新！'}\r\n");
      out.write("            ,elem: '#test'\r\n");
      out.write("            ,height: 'full-77'\r\n");
      out.write("            ,page: true\r\n");
      out.write("            ,url:'/StudentAll'\r\n");
      out.write("            ,response: {\r\n");
      out.write("                statusCode : 200\r\n");
      out.write("            }\r\n");
      out.write("            ,toolbar: '#toolbarDemo'\r\n");
      out.write("            ,cols: [[\r\n");
      out.write("                {fixed:'left', type:'checkbox', width: '5%'}\r\n");
      out.write("                ,{field:'id', width: '10%', title: '学生ID', sort: true, align:'center', fixed:'left'}\r\n");
      out.write("                ,{field:'name', width: '10%', title: '学生姓名', align:'center'}\r\n");
      out.write("                ,{field:'sex', width: '10%', title: '学生性别', align:'center'}\r\n");
      out.write("                ,{field:'birthday', width: '10%', title: '出生年月', align:'center'}\r\n");
      out.write("                ,{field:'mobile', width: '15%', title: '学生电话', align:'center'}\r\n");
      out.write("                ,{field:'email', width: '20%', title: '学生邮箱', align:'center'}\r\n");
      out.write("                ,{field:'clazzName', width: '10%', title: '学生班级', align:'center'}\r\n");
      out.write("                ,{field:'teacherName', width: '10%', title: '学生导师', align:'center'}\r\n");
      out.write("                ,{fixed: 'right', width: '20%', title: '基本操作', align:'center', toolbar: '#barDemo'}\r\n");
      out.write("            ]]\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        table.on('tool(demo)', function (obj) {\r\n");
      out.write("            var data = obj.data;\r\n");
      out.write("            if(obj.event === 'detail'){\r\n");
      out.write("                layer.open({\r\n");
      out.write("                    anim: 6\r\n");
      out.write("                    ,title: '教师信息查看'\r\n");
      out.write("                    ,type: 2\r\n");
      out.write("                    ,content: 'StudentDetail.jsp'\r\n");
      out.write("                    ,area:['600px', '580px'],\r\n");
      out.write("                    success : function(layero, index){\r\n");
      out.write("                        const body = layer.getChildFrame(\"body\", index);\r\n");
      out.write("                        body.find(\"#id\").val(data.id);\r\n");
      out.write("                        body.find(\"#name\").val(data.name);\r\n");
      out.write("                        body.find(\"#sex\").val(data.sex);\r\n");
      out.write("                        body.find(\"#birthday\").val(data.birthday);\r\n");
      out.write("                        body.find(\"#mobile\").val(data.mobile);\r\n");
      out.write("                        body.find(\"#email\").val(data.email);\r\n");
      out.write("                        body.find(\"#clazzName\").val(data.clazzName);\r\n");
      out.write("                        body.find(\"#teacherName\").val(data.teacherName);\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            } else if(obj.event === 'del'){\r\n");
      out.write("                layer.confirm('您确定要删除该条数据吗？', function (index) {\r\n");
      out.write("                    $.ajax({\r\n");
      out.write("                        url: '/delStudent',\r\n");
      out.write("                        type: 'POST',\r\n");
      out.write("                        data: {id: data.id},\r\n");
      out.write("                        success: function (res) {\r\n");
      out.write("                            if (res.code === 200){\r\n");
      out.write("                                tableIns.reload();\r\n");
      out.write("                                layer.msg('删除成功！');\r\n");
      out.write("                            }else{\r\n");
      out.write("                                layer.msg('删除失败！');\r\n");
      out.write("                            }\r\n");
      out.write("                        },\r\n");
      out.write("                        error: function (error) {\r\n");
      out.write("                            layer.msg(error);\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                    layer.close(index);\r\n");
      out.write("                });\r\n");
      out.write("            } else if(obj.event === 'edit'){\r\n");
      out.write("                json = JSON.stringify(data);\r\n");
      out.write("                layer.open({\r\n");
      out.write("                    skin: 'layui-layer-molv'\r\n");
      out.write("                    ,anim: 6\r\n");
      out.write("                    ,title: '学生信息编辑'\r\n");
      out.write("                    ,type: 2\r\n");
      out.write("                    ,content: 'StudentEdit.jsp'\r\n");
      out.write("                    ,btn: ['确定', '取消']\r\n");
      out.write("                    ,area:['600px', '550px'],\r\n");
      out.write("                    yes:function (index, layero) {\r\n");
      out.write("                        const iframeWindow = window['layui-layer-iframe' + index]\r\n");
      out.write("                            , submitID = 'user-add-save'\r\n");
      out.write("                            , submit = layero.find('iframe').contents().find('#' + submitID);\r\n");
      out.write("\r\n");
      out.write("                        iframeWindow.layui.form.on('submit(' + submitID + ')', function (data) {\r\n");
      out.write("                            const field = data.field;\r\n");
      out.write("                            $.ajax({\r\n");
      out.write("                                url:'/editStudent',\r\n");
      out.write("                                type: 'POST',\r\n");
      out.write("                                data: JSON.stringify(field),\r\n");
      out.write("                                success: function (res){\r\n");
      out.write("                                    if (res.code === 200) {\r\n");
      out.write("                                        tableIns.reload();\r\n");
      out.write("                                        layer.close(index);\r\n");
      out.write("                                        layer.msg('编辑成功!');\r\n");
      out.write("                                    } else {\r\n");
      out.write("                                        layer.msg('编辑失败!');\r\n");
      out.write("                                    }\r\n");
      out.write("                                },\r\n");
      out.write("                                error: function (error){\r\n");
      out.write("                                    layer.msg('error');\r\n");
      out.write("                                }\r\n");
      out.write("                            });\r\n");
      out.write("                        });\r\n");
      out.write("                        submit.trigger('click');\r\n");
      out.write("                    },\r\n");
      out.write("                    success: function (layero, index) {\r\n");
      out.write("                        const body = layer.getChildFrame(\"body\", index);\r\n");
      out.write("                        body.find(\"#id\").val(data.id);\r\n");
      out.write("                        body.find(\"#name\").val(data.name);\r\n");
      out.write("                        body.find(\"#sex\").val(data.sex);\r\n");
      out.write("                        body.find(\"#birthday\").val(data.birthday);\r\n");
      out.write("                        body.find(\"#mobile\").val(data.mobile);\r\n");
      out.write("                        body.find(\"#email\").val(data.email);\r\n");
      out.write("                        body.find(\"#clazzName\").val(data.clazzName);\r\n");
      out.write("                        body.find(\"#teacherName\").val(data.teacheName);\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        table.on('toolbar(demo)', function (obj) {\r\n");
      out.write("            var checkStatus = table.checkStatus(obj.config.id);\r\n");
      out.write("            switch(obj.event){\r\n");
      out.write("                case 'refreshTable':\r\n");
      out.write("                    location.reload();\r\n");
      out.write("                    break;\r\n");
      out.write("                case 'add':\r\n");
      out.write("                    layer.open({\r\n");
      out.write("                        skin: 'layui-layer-lan'\r\n");
      out.write("                        ,anim: 6\r\n");
      out.write("                        ,title: '教师信息添加'\r\n");
      out.write("                        ,type: 2\r\n");
      out.write("                        ,content: 'StudentAdd.jsp'\r\n");
      out.write("                        ,btn: ['确定', '取消']\r\n");
      out.write("                        ,area:['600px', '490px'],\r\n");
      out.write("                        yes: function (index, layero) {\r\n");
      out.write("                            const iframeWindow = window['layui-layer-iframe' + index]\r\n");
      out.write("                                , submitID = 'user-add-save'\r\n");
      out.write("                                , submit = layero.find('iframe').contents().find('#' + submitID);\r\n");
      out.write("\r\n");
      out.write("                            iframeWindow.layui.form.on('submit(' + submitID + ')', function (data) {\r\n");
      out.write("                                const field = data.field;\r\n");
      out.write("                                $.ajax({\r\n");
      out.write("                                    url: '/addStudent',\r\n");
      out.write("                                    type: 'POST',\r\n");
      out.write("                                    data: JSON.stringify(field),\r\n");
      out.write("                                    success: function (res) {\r\n");
      out.write("                                        if(res.code === 200){\r\n");
      out.write("                                            tableIns.reload();\r\n");
      out.write("                                            layer.close(index);\r\n");
      out.write("                                            layer.msg('添加成功！')\r\n");
      out.write("                                        }else{\r\n");
      out.write("                                            layer.msg('添加失败！');\r\n");
      out.write("                                        }\r\n");
      out.write("                                    },\r\n");
      out.write("                                    error: function (error) {\r\n");
      out.write("                                        layer.msg(error);\r\n");
      out.write("                                    }\r\n");
      out.write("                                });\r\n");
      out.write("                            });\r\n");
      out.write("                            submit.trigger('click');\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                    break;\r\n");
      out.write("                case 'del':\r\n");
      out.write("                    var data = checkStatus.data;\r\n");
      out.write("                    if (data.length > 0){\r\n");
      out.write("                        layer.confirm('您确定要删除所选数据吗？', function (index) {\r\n");
      out.write("                            $.ajax({\r\n");
      out.write("                                url: '/delStudents',\r\n");
      out.write("                                type: 'POST',\r\n");
      out.write("                                data: JSON.stringify(data),\r\n");
      out.write("                                success: function (res) {\r\n");
      out.write("                                    if(res.code === 200){\r\n");
      out.write("                                        tableIns.reload();\r\n");
      out.write("                                        layer.msg('删除成功！')\r\n");
      out.write("                                    }else{\r\n");
      out.write("                                        layer.msg('删除失败！');\r\n");
      out.write("                                    }\r\n");
      out.write("                                },\r\n");
      out.write("                                error: function (error) {\r\n");
      out.write("                                    layer.msg(error);\r\n");
      out.write("                                }\r\n");
      out.write("                            });\r\n");
      out.write("                            layer.close(index);\r\n");
      out.write("                        });\r\n");
      out.write("                    }else{\r\n");
      out.write("                        layer.msg(\"您至少应该选择一条数据！\");\r\n");
      out.write("                    }\r\n");
      out.write("                    break;\r\n");
      out.write("                case 'search':\r\n");
      out.write("                    var data = document.getElementById('info').value;\r\n");
      out.write("                    if(data.replace(/(^\\s*)|(\\s*$)|(\\n)/g, \"\").length > 0){\r\n");
      out.write("                        data = data.replace(/^\\s*|\\s*$/g,\"\");\r\n");
      out.write("                        layer.msg('查询成功！');\r\n");
      out.write("                        tableIns.reload({\r\n");
      out.write("                            url: '/searchStudents?info='+data\r\n");
      out.write("                        })\r\n");
      out.write("                    }else {\r\n");
      out.write("                        layer.msg('请不要填入空数据！');\r\n");
      out.write("                    }\r\n");
      out.write("                    break;\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
