<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>商家信息管理界面</title>
    <link rel="stylesheet" href="layui/css/layui.css">
    <style>

        table

        {
            border-collapse: collapse;
            margin: 0 auto;
            text-align: center;
        }
        table td, table th
        {
            border: 1px solid #cad9ea;
            color: #666;
            height: 30px;
        }
        table thead th
        {
            background-color: #CCE8EB;
            width: 100px;
        }
        table tr:nth-child(odd)
        {
            background: #fff;
        }
        table tr:nth-child(even)
        {
            background: #F5FAFA;
        }
        /*搜索框1*/
        .bar1 {
            width: 220px;
            margin-left: 70px;
            margin-bottom: 20px;
        }
        .bar1 input {
            /*border: 2px solid #7BA7AB;*/
            border-radius: 5px;
            background: #F9F0DA;
            color: #9E9C9C;
        }
    </style>

</head>
<body>
<br>
<div style="color: black; font-size: 30px;margin-bottom: 25px ;text-align: center;padding-left: 25px">
    商家信息管理
</div>
<div class="bar1">
    <form action="merByNameServlet" method="post" id="form">
        <input id="name" name="name" type="text" placeholder="搜索商家名称">
        <button type="submit" style="background-color: #047c72; color: white;border-radius: 10px;width: 35px">搜索</button>
    </form>
</div>


<table border="1" cellspacing="0" width="80%">
    <tr>
        <th>序号</th>
        <th>用户名</th>
        <th>店铺名称</th>
        <th>手机号</th>
        <th>品牌介绍</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${merchants}" var="item" varStatus="status">
        <tr align="center">

            <td>${status.count}</td>
            <td>${item.userName}</td>
            <td>${item.name}</td>
            <td>${item.phone}</td>
            <td>${item.description}</td>

            <td>
                <input type="button" onclick="fix(${item.id})" style="background-color: #047c72; color: white;border-radius: 10px;width: 45px" value="修改"/>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="button" onclick="confirm_del(${item.id})" style="background-color: #047c72; color: white;border-radius: 10px;width: 45px" value="删除">
            </td>
        </tr>
    </c:forEach>

</table>
<script>
    function fix(id){
        location.href="merByIdServlet?id="+id;
    }
    function confirm_del(id){
            var msg = "您真的确定要删除吗？\n\n请确认！";
            if (confirm(msg)==true){
                var xhttp;
                if (window.XMLHttpRequest) {
                    xhttp = new XMLHttpRequest();
                } else {
                    // code for IE6, IE5
                    xhttp = new ActiveXObject("Microsoft.XMLHTTP");
                }
                xhttp.open("GET","http://localhost:8080/webHomeWork/merDeleteByIdServlet?id="+id);
                xhttp.send();
                xhttp.onreadystatechange=function (){
                    if(this.readyState==4&&this.status==200){
                        if(this.responseText=="false"){
                            alert("改商家名下还有商品,不可删除！");
                        }else{
                            alert("删除成功！");
                            location.href="merAllServlet";
                        }
                    }

                }
                return true;
            }else{
                return false;
            }
    }

</script>


</body>
</html>
