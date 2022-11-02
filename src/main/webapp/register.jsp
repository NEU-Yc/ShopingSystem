<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>欢迎注册</title>
    <link href="css/register.css" rel="stylesheet">
</head>
<body>
<div class="rg_layout">
    <div class="rg_left">

        <p> REGISTER</p>
    </div>
    <div class="rg_center">
        <div class="td_form">
            <form action="registerServlet" id="form" method="post">
                <table>
                    <tr>
                        <!-- lable for 与某个表单元素绑定，点在lable上，自动将焦点移动到绑定的元素上 -->
                        <td class="td_left"><label for="username">用户名</label></td>
                        <td class="td_right">
                            <input type="text" name="username" id="username" placeholder="长度为5-10位数字字母：">
                            <span id="s_username" class="error">${register_msg}</span>
                        </td>
                    </tr>
                    <tr>
                        <td class="td_left"><label for="password">密码</label></td>
                        <td class="td_right">
                            <!-- id是唯一的，name可以重复
                                name会同时对应多个控件，如checkbox radio
                            -->
                            <input type="password" name="password" id="password" placeholder="长度为6-12位数字,字母：">
                            <span id="s_password" class="error"></span>
                        </td>
                    </tr>
                    <tr>
                        <td class="td_left"><label for="name">店铺名称</label></td>
                        <td class="td_right">
                            <input type="text" name="name" id="name" placeholder="请输入店铺名称:">
                            <span id="s_name" class="error"></span>
                        </td>
                    </tr>
                    <tr>
                        <td class="td_left"><label for="phone">手机号</label></td>
                        <td class="td_right">
                            <input type="text" name="phone" id="phone" placeholder="请输入手机号：">
                            <span id="s_phone" class="error"></span>
                        </td>
                    </tr>

                    <tr>
                        <td class="td_left"><label for="checkcode">验证码</label></td>
                        <td class="td_right">
                            <input name="checkCode" type="text" id="checkCode">
                            <img id="checkCodeImg" src="checkCodeServlet">
                            <a href="#" id="changeImg" >看不清？</a>
                            <span id="s_code" class="error">${code_msg}</span>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" id="td_sub">
                            <input type="submit"  id="btn_sub" value="注册"></td>
                    </tr>

                </table>
            </form>
        </div>

    </div>
    <div class="rg_right">
        <p>已有账号？<a href="login.jsp">立即登录</a></p>
    </div>
</div>
<script>
    var flag_username=true;
    window.onload = function(){
        //1.给表单绑定onsubmit事件
        document.getElementById("form").onsubmit = function(){
            return flag_username&&checkUsername()&&checkPassword()&&checkPhone()&&checkName();
        }
        document.getElementById("password").onblur = checkPassword;
        document.getElementById("phone").onblur = checkPhone;
        document.getElementById("name").onblur = checkName;
    }
    function  checkUsername(){
        var username=document.getElementById("username").value;
        var reg_username=/^.+$/;
        var flag=reg_username.test(username);
        var s_username=document.getElementById("s_username");
        if(!flag){
            s_username.innerHTML="请输入用户名";
        }
        return flag;
    }
    function checkPassword(){
        var password=document.getElementById("password").value;
        var reg_password=/^[a-zA-Z0-9_]{6,12}$/;
        var flag=reg_password.test(password);
        var s_password=document.getElementById("s_password");
        if(flag){
            s_password.innerHTML="<img width='35' height='25' src='./imgs/gou.jpg'/>";
        }else{
            s_password.innerHTML="密码格式有误";
        }
        return flag;
    }
    function checkPhone(){
        var phone=document.getElementById("phone").value;
        var reg_phone=/^[1][3,4,5,7,8][0-9]{9}$/;
        var flag=reg_phone.test(phone);
        var s_phone=document.getElementById("s_phone");
        if(flag){
            s_phone.innerHTML="<img width='35' height='25' src='./imgs/gou.jpg'/>";
        }else{
            s_phone.innerHTML="电话格式有误";
        }
        return flag;
    }
    function checkName(){
        var name=document.getElementById("name").value;
        var reg_name=/^.+$/;
        var flag=reg_name.test(name);
        var s_name=document.getElementById("s_name");
        if(flag){
            s_name.innerHTML="<img width='35' height='25' src='./imgs/gou.jpg'/>";
        }else {
            s_name.innerHTML="请输入店铺名称";
        }
        return flag;
    }
    document.getElementById("changeImg").onclick=function (){
        document.getElementById("checkCodeImg").src="checkCodeServlet?"+new Date().getMilliseconds();
    }
    document.getElementById("username").onblur=function (){
        var username=this.value;
        var reg_username=/^[a-zA-Z0-9_]{5,10}$/;
        var flag=reg_username.test(username);
        var s_username=document.getElementById("s_username");
        if(flag){
            s_username.innerHTML="<img width='35' height='25' src='./imgs/gou.jpg'/>";
        }else{
            s_username.innerHTML="用户格式有误";
        }
        var xhttp;

        if (window.XMLHttpRequest) {
            xhttp = new XMLHttpRequest();
        } else {
            // code for IE6, IE5
            xhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        xhttp.open("GET","http://localhost:8080/webHomeWork/merByUsernameServlet?username="+username);
        xhttp.send();
        xhttp.onreadystatechange=function (){
            if(this.readyState==4&&this.status==200){
                if(this.responseText=="true"){
                    document.getElementById("s_username").innerHTML="该用户名已被使用";
                    flag_username=false;
                }else{
                    flag_username=true;

                }
            }

        }
    }
</script>
</body>
</html>