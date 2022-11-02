<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>商家信息修改</title>
    <link href="css/goodAdd.css" rel="stylesheet">
    <style>
        .add_layout{
            height: 440px;

        }
    </style>
</head>
<body>
<div class="add_layout">
    <div class="add_left">
        <p>商家信息修改</p>
    </div>
    <div class="add_center">
        <div class="td_form">
            <form action="merUpdateServlet" id="form" method="post">
                <table>
                    <input type="hidden" name="id" value="${merchant.id}"><br>
                    <tr>
                        <!-- lable for 与某个表单元素绑定，点在lable上，自动将焦点移动到绑定的元素上 -->
                        <td class="td_left"><label for="name">店铺名称</label></td>
                        <td class="td_right">
                            <input type="text" name="name" id="name" value="${merchant.name}">
                            <span id="s_name" class="error"></span>
                        </td>
                    </tr>

                    <tr>
                        <td class="td_left"><label for="phone">手机号</label></td>
                        <td class="td_right">
                            <input type="text" name="phone" id="phone" value="${merchant.phone}">
                        </td>
                    </tr>

                    <tr>
                        <td class="td_left">
                            <label>描述信息</label>
                        </td>
                        <td class="td_right">
                            <textarea rows="5" cols="20" id="description" name="description">${merchant.description}</textarea>
                        </td>
                    </tr>

                    <tr>
                        <td colspan="2" id="td_sub">
                            <input type="submit"  id="btn_sub" value="修改">
                        </td>
                    </tr>

                </table>
            </form>
        </div>
    </div>
    <div class="add_right">
    </div>
</div>

</body>
</html>