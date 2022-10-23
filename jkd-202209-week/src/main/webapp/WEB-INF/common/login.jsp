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
    <link rel="stylesheet" href="/dev/plugins/layui/css/layui.css">
    <link rel="stylesheet" href="/dev/css/common/register.css">

    <style>
        .login {
            text-align: center;
            opacity: 0.8;
        }
        body {
            background-image: url("../imgs/bg.jpg");
            background-repeat: no-repeat;
            background-position: center 0;
            background-attachment: fixed;
            background-size: cover;
            -webkit-background-size: cover;
            -o-background-size: cover;
            -moz-background-size: cover;
            -ms-background-size: cover;

        }
        .loginPart{
            position:absolute;
            top:50%;
            left:50%;
            transform:translate(-50%,-50%);
            width:450px;
            padding:50px;
            background: rgba(0,0,0,.5);
            box-sizing:border-box;
            box-shadow: 0px 15px 25px rgba(0,0,0,.5);

            border-radius:15px;

        }
        .white{
            color: white;
        }
    </style>
</head>
<body>
<div class="login vertical-center">
    <div class="modal-dialog">
        <form method="POST" > <!-- 表单 -->
            <div class="loginPart">
                <div class="modal-header">
                    <!-- 登录面板标题 -->
                    <h2 class="modal-title text-center white" id="myModalLabel" >登录账户</h2>
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
                </div>
                <div class="modal-footer">
                    <!-- 操作按钮 -->
                    <div class="form-group">

                        <button type="button" class="btn btn-primary" onclick="login()">登录</button>
                        <a class="btn btn-default" href="/dev/user/register" >注册</a>
                        <button type="button" class="btn btn-danger" onclick="window.location.href='/dev/user/index'; return false;">取消</button>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
<script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.js"></script>
<script src="/dev/plugins/layui/layui.js"></script>
<script>
    function login(){
        // js写法
        // let username = document.getElementById("username").value;
        // let password = document.getElementById("password").value;
        let username = $("#username").val();//jquery写法
        let password = $("#password").val();
        let param = "username="+username+"&password="+password;
        $.post('/dev/user/loginToWeb',param,function(res){
            // alert(res.msg)
            if (res.code == 200){
                layer.msg(res.msg,{icon:1})
            }else{
                layer.msg(res.msg,{icon: 2})
            }


        })
    }
</script>
