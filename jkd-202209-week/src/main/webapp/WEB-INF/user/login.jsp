<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/dev/plugins/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="/dev/css/common/nav.css">
    <style>
        #login_div{
            box-shadow: 2px -2px 8px #999;
            border-radius: 10px;
            margin-top: 80px;
        }
    </style>
</head>
<body>
<%--    导航--%>
<%@include file="../common/nav.jsp"%>

<%--    轮播图--%>
<%@include file="../common/Carousel.jsp"%>

<%--    缩略图--%>
<%@include file="../common/thumbnai.jsp"%>

<script src="/dev/plugins/jquery/jquery.min.js"></script>
<script src="/dev/plugins/bootstrap/js/bootstrap.js"></script>
</body>
</html>

