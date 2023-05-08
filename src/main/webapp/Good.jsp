<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>商品信息管理界面</title>
    <link rel="stylesheet" href="layui/css/layui.css">
    <link href="css/good.css" rel="stylesheet">
</head>
<body>
<br>

<%--<a href="GoodAdd.jsp">添加商品</a>--%>




    <div style="color: black; font-size: 30px;margin-bottom: 25px ;text-align: center;padding-left: 25px">
        商品信息管理
        <div class="add">
            <button  id="btn_sub" onclick="add()">添加商品</button>
        </div>
    </div>
   <div class="search bar1">
            <form action="goodSearchNameServlet" method="post" id="form">
                <input id="name" name="name" type="text" placeholder="搜索商品名称">
                <button type="submit" style="background-color: #047c72; color: white;border-radius: 10px;width: 35px">搜索</button>
            </form>
        </div>


        <table border="1" cellspacing="0" width="80%">
            <tr>
                <th>序号</th>
                <th>商品编号</th>
                <th>商品名称</th>
                <th>价格</th>
                <th>库存</th>
                <th>商品介绍</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${goods}" var="item" varStatus="status">
                <tr align="center">

                    <td>${status.count}</td>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.price}</td>
                    <td>${item.inventory}</td>
                    <td>${item.description}</td>

                    <td><input type="button" onclick="fix(${item.id})" style="background-color: #047c72; color: white;border-radius: 10px;width: 45px" value="修改"/> &nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="button" onclick="confirm_del(${item.id})" style="background-color: #047c72; color: white;border-radius: 10px;width: 45px" value="删除"></td>
                </tr>
            </c:forEach>

        </table>



<script>
    function fix(id){
        location.href="gooByIdServlet?id="+id;
    }
    function confirm_del(id){
        var msg = "您真的确定要删除吗？\n\n请确认！";
        if (confirm(msg)==true){
            location.href="goodDeleteByIdServlet?id="+id;
            alert("删除成功！");
            return true;
        }else{
            return false;
        }
    }
    function add(){
        location.href="GoodAdd.jsp";
    }
</script>


</body>
</html>
