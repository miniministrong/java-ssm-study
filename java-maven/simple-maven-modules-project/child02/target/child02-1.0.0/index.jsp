<%@ page import="study.maven.SayHello" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>hello</title>
    </head>
    <body>
        <%
            SayHello sayHello = new SayHello();
            sayHello.SayHello("张三");
        %>
    </body>
</html>
