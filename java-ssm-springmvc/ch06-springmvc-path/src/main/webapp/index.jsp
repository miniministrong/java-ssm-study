<%--
  author: dhl
  datetime: 2021/7/27 11:32
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath() + "/";
%>
<html>
    <head>
        <title>首页</title>
        <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
        <base href="<%=basePath%>"/>
    </head>
    <body>
        <div align="center">
            <h1>主页</h1>
            <a href="user/some">发起请求</a>
        </div>

    </body>
</html>
