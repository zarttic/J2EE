<%--
  Created by IntelliJ IDEA.
  User: liyaj
  Date: 2022/10/22
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/dev/plugins/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="/dev/css/common/nav.css">
    <link rel="stylesheet" href="/dev/css/common/Carousel.css">
</head>
<body>
<%--导航--%>
<%--登录--%>
<%@include file="../common/register.jsp"%>
<script>
    var li=document.getElementsByTagName("li");
    console.log(li);
    for(var i=0;i<li.length;i++) {li[i].className="";}
    li[3].className="active";
    console.log(li);
</script>
<script src="/dev/plugins/jquery/jquery.min.js"></script>
<script src="/dev/plugins/bootstrap/js/bootstrap.js"></script>
</body>
</html>
