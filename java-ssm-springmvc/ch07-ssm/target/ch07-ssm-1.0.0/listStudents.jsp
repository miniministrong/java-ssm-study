<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath() + "/";
%>
<html>
    <head>
        <title>使用ajax查询学生信息</title>
        <base href="<%=basePath%>">
        <script type="text/javascript" src="static/js/jquery-3.6.0.js"></script>
        <script type="text/javascript">
            $(function (){
                loadStudentInfo();
                $("#btnQuery").click(function () {
                    loadStudentInfo();
                })
            })
            function loadStudentInfo(){
                $.ajax({
                    url: "student/listStudents",
                    type: "get",
                    dataType: "json",
                    success: function (data) {
                        //alert(data);
                        // 清楚旧的数据
                        $("#info").html("");
                        // 添加新的数据
                        $.each(data, function (i, n){
                            $("#info").append("<tr>")
                                .append("<td>" + n.id + "</td>")
                                .append("<td>" + n.name + "</td>")
                                .append("<td>" + n.age + "</td>")
                                .append("</tr>");
                        })
                    }
                })
            }
        </script>
    </head>
    <body>
        <div align="center">
            <table border="1">
                <thead>
                    <tr>
                        <th>学号</th>
                        <th>姓名</th>
                        <th>年龄</th>
                    </tr>
                </thead>
                <tbody id="info">

                </tbody>
            </table>
            <input type="button" id="btnQuery" value="点击查询">
        </div>
    </body>
</html>
