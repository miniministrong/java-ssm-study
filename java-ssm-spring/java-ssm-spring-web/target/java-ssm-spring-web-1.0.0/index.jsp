<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>注册页面</title>
    </head>
    <body>
        <div align="center">
            <form action="/register" method="post">
                <table>
                    <tr>
                        <td>学号：</td>
                        <td><input type="text" name="id"></td>
                    </tr>
                    <tr>
                        <td>姓名：</td>
                        <td><input type="text" name="name"></td>
                    </tr>
                    <tr>
                        <td>邮箱：</td>
                        <td><input type="text" name="email"></td>
                    </tr>
                    <tr>
                        <td>年龄：</td>
                        <td><input type="text" name="age"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="提交"></td>
                        <td><input type="reset" value="重置"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
