<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link href="css/login.css" rel="stylesheet">
    <script>
        window.onload = function(){
            // //1.给表单绑定onsubmit事件
            document.getElementById("form").onsubmit = function(){
                var s_remember=document.getElementById("s_remember");
                if(document.getElementById("manager").checked||document.getElementById("merchant").checked){
                    s_remember.innerHTML="";
                    return checkUsername() && checkPassword();
                }else {
                    s_remember.innerHTML="请选择身份";
                }
                    return false;
            }

            //给用户名和密码框分别绑定离焦事件 onblur的事件会在对象失去焦点时发生
            document.getElementById("username").onblur = checkUsername;
            document.getElementById("password").onblur = checkPassword;
        }

        function checkUsername(){
            var username=document.getElementById("username").value;
            var reg_username=/^.+$/;
            var flag=reg_username.test(username);
            var s_username=document.getElementById("s_username");
            if(flag){
                s_username.innerHTML="";
            }else {
                s_username.innerHTML="请输入账号";
            }
            return flag;
        }

        function checkPassword(){
            var password=document.getElementById("password").value;
            var reg_password=/^.+$/;
            var flag=reg_password.test(password);
            var s_password=document.getElementById("s_password");
            if(flag){
                s_password.innerHTML="";
            }else {
                s_password.innerHTML="请输入密码";
            }
            return flag;
        }

    </script>

</head>

<body>
<div id="loginDiv" style="height: 350px">
    <form action="loginServlet" method="post" id="form">
        <h1 id="loginMsg">LOGIN IN</h1>
        <div id="errorMsg">${login_msg}${register_msg}</div>
        <p>Username:<input id="username" name="username" value="${cookie.username.value}" type="text"><span id="s_username" class="error"></span></p>
        <p>Password:<input id="password" name="password" value="${cookie.password.value}" type="password"><span id="s_password" class="error"></span></p>
        <p>Remember:<input id="remember" name="remember" value="1" type="checkbox"></p>
        <p class="choice">
            <input class="radio_type" type="radio" name="identity" value="manager" id="manager" />
            <label for="manager">管理员</label>
            <input class="radio_type" type="radio" name="identity" value="merchant" id="merchant" />
            <label for="merchant">商家</label>
            <span id="s_remember" class="error"></span>
        </p>

        <div id="subDiv">
            <input type="submit" class="button" value="login up">
            <input type="reset" class="button" value="reset">&nbsp;&nbsp;&nbsp;
            <a  href="register.jsp">没有商家账号？</a>
        </div>
    </form>
</div>


</body>
</html>