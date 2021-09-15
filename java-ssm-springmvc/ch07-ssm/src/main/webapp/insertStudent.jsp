<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath() + "/";
%>
<html>
    <head>
        <title>注册</title>
        <base href="<%=basePath%>">
    </head>
    <body>
        <div align="center">
            <form action="student/insertStudent" method="post">
                <table>
                    <tr>
                        <td>姓名：</td>
                        <td><input type="text" name="name"></td>
                    </tr>
                    <tr>
                        <td>年龄：</td>
                        <td><input type="text" name="age"></td>
                    </tr>
                    <tr>
                        <td rowspan="2" align="center"><input type="submit" value="提交"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
