<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath() + "/";
%>
<html>
    <head>
        <title>首页</title>
        <base href="<%=basePath%>">
    </head>
    <body>
        <div align="center">
            <h1>forward</h1>
            <form action="/forward" method="post">
                姓名：<input type="text" name="name"><br>
                年龄：<input type="text" name="age"><br>
                <input type="submit" value="请求转发">
            </form>
        </div>

        <div align="center">
            <h1>redirect</h1>
            <form action="/redirect" method="post">
                姓名：<input type="text" name="name"><br>
                年龄：<input type="text" name="age"><br>
                <input type="submit" value="重定向">
            </form>
        </div>
    </body>
</html>
