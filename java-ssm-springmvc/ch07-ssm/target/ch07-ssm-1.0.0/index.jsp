<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath() + "/";
%>
<html>
    <head>
        <title>功能入口</title>
        <base href="<%=basePath%>"/>
    </head>
    <body>
        <div align="center">
            <h1>SSM整合的例子</h1>
            <img src="static/images/header.jpg" alt="资源被吞了QAQ">
            <table>
                <tr>
                    <td><a href="insertStudent.jsp">注册学生</a></td>
                </tr>
                <tr>
                    <td><a href="listStudents.jsp">查看学生信息</a></td>
                </tr>
            </table>
        </div>
    </body>
</html>
