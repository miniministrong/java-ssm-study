<%--
  author: dhl
  datetime: 2021/7/26 11:59
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>首页</title>
        <meta charset="UTF-8">
    </head>
    <body>
        <div align="center">
            <h1>提交给Controller</h1>
            <form action="receive.do" method="post">
                姓名：<input type="text" name="name"><br>
                年龄：<input type="text" name="age"><br>
                <input type="submit" value="提交">
            </form>
        </div>
        <br>
        <br>
        <div align="center">
            <h1>当参数名和形参中的名称不一样时，提交给Controller</h1>
            <form action="/receiveParam.do" method="post">
                姓名：<input type="text" name="rname"><br>
                年龄：<input type="text" name="rage"><br>
                <input type="submit" value="提交">
            </form>
        </div>
        <br>
        <br>
        <div align="center">
            <h1>使用java对象接收请求参数</h1>
            <form action="/receiveObject.do" method="post">
                姓名：<input type="text" name="name"><br>
                年龄：<input type="text" name="age"><br>
                <input type="submit" value="提交">
            </form>
        </div>
    </body>
</html>
