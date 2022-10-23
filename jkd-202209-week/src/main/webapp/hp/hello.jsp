<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/dev/plugins/bootstrap/css/bootstrap.css">
    <style>
        #head_img{
            height: 50px;
            width: 50px;
            border-radius: 50%;
            padding: 5px;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-inverse" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#example-navbar-collapse">
                <span class="sr-only">切换导航</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Apple</a>
        </div>
        <div class="collapse navbar-collapse" id="example-navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="#">首页</a></li>
                <li><a href="#">我的购物车</a></li>
                <li><a href="#">我的订单</a></li>
                <li><a href="#">登录</a></li>
                <li><a href="#">安全退出</a></li>
                <li><img id="head_img" src="../imgs/girl.png"></li>
            </ul>
        </div>
    </div>
</nav>

<script src="/dev/plugins/jquery/jquery.min.js"></script>
<script src="/dev/plugins/bootstrap/js/bootstrap.js"></script>
</body>
</html>
