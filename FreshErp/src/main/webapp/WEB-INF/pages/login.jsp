<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 9/29/17
  Time: 8:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>登录</title>
    <!-- custom-theme -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords"
          content="Trendy Signin Form web template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design"/>
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);

    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
    <!-- //custom-theme -->
    <link href="../css/sy_login.css" rel="stylesheet" type="text/css" media="all"/>
    <link href="//fonts.googleapis.com/css?family=Rajdhani:300,400,500,600,700" rel="stylesheet">
</head>
<body class="bg agileinfo">
<h1 class="agile_head text-center">惠民生鲜后台管理</h1>
<h2 class="w3layouts text-center">Sheng xian hou tai guan li.</h2>
<div class="container w3">
    <form action="/user/login" method="post">
        <div class="form_w3layouts">
            <div class="username">
                <span class="labe1">账户</span>
                <input type="text" name="userName" class="email" placeholder="请输入用戶名" required="">
                <div class="clear"></div>
            </div>
            <div class="password-agileits">
                <span class="label2">密码</span>
                <input type="password" name="passWord" class="password" placeholder="请输入密码" required="">
                <div class="clear"></div>
            </div>
        </div>
        <div class="clear"></div>
        <div class="login-w3">
            <input type="submit" class="login wthree" value="登录">
            <div class="clear"></div>
        </div>
    </form>
</div>
<div class="agileits_w3layouts_copyright text-center">
    <p> © 惠民生鲜超市有限公司 <a href="http://www.baidu.com/"> 惠民生鲜</a></p>
</div>
</body>
</html>
