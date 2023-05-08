<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>商品添加</title>
    <link href="css/goodAdd.css" rel="stylesheet">
</head>
<body>
<div class="add_layout">
    <div class="add_left">

        <p>商品添加</p>
    </div>
    <div class="add_center">
        <div class="td_form">
            <form action="goodAddServlet" id="form" method="post">
                <table>
                    <tr>
                        <!-- lable for 与某个表单元素绑定，点在lable上，自动将焦点移动到绑定的元素上 -->
                        <td class="td_left"><label for="name">商品名称</label></td>
                        <td class="td_right">
                            <input type="text" name="name" id="name">
                            <span id="s_name" class="error"></span>
                        </td>
                    </tr>
                    <tr>
                        <td class="td_left"><label for="price">价格</label></td>
                        <td class="td_right">
                            <!-- id是唯一的，name可以重复
                                name会同时对应多个控件，如checkbox radio
                            -->
                            <input type="text" name="price" id="price">
                        </td>
                    </tr>
                    <tr>
                        <td class="td_left"><label for="inventory">库存</label></td>
                        <td class="td_right">
                            <input type="text" name="inventory" id="inventory" >
                        </td>
                    </tr>
                    <tr>
                        <td class="td_left"><label for="description">商品描述</label></td>
                        <td class="td_right">
                            <input type="text" name="description" id="description">
                        </td>
                    </tr>

                    <tr>
                        <td colspan="2" id="td_sub">
                            <input type="submit"  id="btn_sub" value="添加"></td>
                    </tr>

                </table>
            </form>
        </div>

    </div>
    <div class="add_right">
    </div>
</div>
<script>
    var flag_name=true;
    window.onload = function(){
        // //1.给表单绑定onsubmit事件
        document.getElementById("form").onsubmit = function(){
            console.log("submit");
            console.log(checkName());
            console.log(flag_name);
                return checkName()&&flag_name;
        }
    }
    function checkName(){
        var testname=document.getElementById("name").value;
        console.log("testname"+testname);
        var reg_username=/^.+$/;
        var flag=reg_username.test(testname);
        var s_name=document.getElementById("s_name");
        if(flag){
            s_name.innerHTML="";
        }else{
            console.log("商品名称不可为空");
            s_name.innerHTML="商品名称不可为空";
        }
        return flag;
    }
    document.getElementById("name").onblur=function (){
        let name = encodeURI(encodeURI(this.value));
        var xhttp;

        if (window.XMLHttpRequest) {
            xhttp = new XMLHttpRequest();
        } else {
            // code for IE6, IE5
            xhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        xhttp.open("GET","http://localhost:8080/webHomeWork/goodByNameServlet?name="+name);
        xhttp.send();
        xhttp.onreadystatechange=function (){
            if(this.readyState==4&&this.status==200){
                if(this.responseText=="true"){
                    document.getElementById("s_name").innerHTML="商品名称重复！请检查或增加库存";
                    flag_name=false;
                }else{
                    document.getElementById("s_name").innerHTML="";
                    flag_name=true;
                }
            }

        }

    }
</script>
</body>
</html>