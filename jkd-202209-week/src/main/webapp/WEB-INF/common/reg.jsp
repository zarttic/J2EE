<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录</title>
    <!-- 引入Boostarp 和 jQuery -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.js"></script>
    <link rel="stylesheet" href="/dev/css/common/register.css">

    <style>
        .login {
            text-align: center;
            opacity: 0.8;     /* 设置透明度*/
        }
        body {
            background-repeat: no-repeat;
            /* 背景图来自百度 */
            background-position: center 0;
            background-attachment: fixed;
            background-size: cover;
            -webkit-background-size: cover;
            -o-background-size: cover;
            -moz-background-size: cover;
            -ms-background-size: cover;

            /*background-image: url("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F3%2F59914c437c099.jpg%3Fdown&refer=http%3A%2F%2Fpic1.win4000.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1668248067&t=346c816f2c2aed346b4b6b00aa218288");*/
        }
    </style>
</head>
<body>
<div class="login vertical-center">
    <div class="modal-dialog">
        <form method="POST" method="."> <!-- 表单 -->
            <div class="modal-content">
                <div class="modal-header">
                    <!-- 登录面板标题 -->
                    <h3 class="modal-title text-center" id="myModalLabel">登录账户</h3>
                </div>
                <div class="modal-body" id="model-body">
                    <!-- 错误信息可以在这个p标签中输出 -->
                    <p style="color: red;" class="error"></p>
                    <div class="form-group has-feedback">
                        <input type="text" id="username" class="form-control" placeholder="用户名" autocomplete="off">
                        <span class="glyphicon glyphicon-user form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="password" id="password" class="form-control" placeholder="密码" autocomplete="off">
                        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                    </div>
                    <p>登录完成后，您就可以享受用户基本的权益了。</p>
                </div>
                <div class="modal-footer">
                    <!-- 操作按钮 -->
                    <div class="form-group">
                        <button type="button" class="btn btn-primary">登录</button>
                        <a class="btn btn-default" href="#">注册</a>
                        <button type="button" class="btn btn-danger" onclick="window.location.href='/'; return false;">取消</button>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
