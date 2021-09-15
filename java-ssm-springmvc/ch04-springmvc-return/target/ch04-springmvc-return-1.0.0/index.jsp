<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>首页</title>
      <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
      <script type="text/javascript">
          $(function (){
              $("button").click(function (){
                  // alert("button click");
                  $.ajax({
                      url:"/returnStringData.do",
                      // url:"returnVoid-ajax.do",
                      data:{
                          name:"zhangsan",
                          age:20
                      },
                      type: "post",
                      // dataType: "json",
                      dataType: "text",
                      success: function (resp) {
                          // resp从服务器端返回的是json格式的字符串{"name":"zhangsan","age":20}
                          // jquery会把字符串转为json对象，赋值给resp形参
                          // alert(resp.name + "    " + resp.age);
                          /*$.each(resp, function (i, n){
                              alert(n.name + "   " + n.age);
                          })*/
                          alert("返回的数据：" + resp);
                      }
                  })
              })
          })
      </script>
  </head>
  <body>
    <div align="center">
        <h1>处理器方法返回String表示视图名称</h1>
        <form action="returnString-view.do" method="post">
            姓名：<input type="text" name="name"><br>
            年龄：<input type="text" name="age"><br>
            <input type="submit" value="提交">
        </form>
    </div>
    <br>
    <br>
    <div align="center">
        <h1>处理器方法返回String表示完整视图路径</h1>
        <form action="returnString-allView.do" method="post">
            姓名：<input type="text" name="name"><br>
            年龄：<input type="text" name="age"><br>
            <input type="submit" value="提交">
        </form>
    </div>
    <br>
    <br>
    <div align="center">
        <button id="btn">发起ajax请求</button>
    </div>
  </body>
</html>
