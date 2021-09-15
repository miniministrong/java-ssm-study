<%--
  author: dhl
  datetime: 2021/7/27 9:10
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
        <meta charset="UTF-8">
        <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
    </head>
    <body>
        <div align="center">
            <h1>测试中央调度器DispatcherServlet的url-pattern</h1>
            <form action="some.do" method="post">
                姓名：<input type="text" name="name"><br>
                年龄：<input type="text" name="age"><br>
                <input type="submit" value="提交">
            </form>
            <a href="html/test.html">这是一个静态资源网页</a><br>
            <img src="images/header.jpg" alt="这是一个静态资源图片，无法显示">
        </div>
    </body>
</html>
