package study.springmvc.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import study.springmvc.vo.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dhl
 * @datetime 2021/7/26  14:53
 */
@Controller
public class MyController {
    /**
     * 处理器方法返回String--表示逻辑视图名称，需要配置视图解析器
     */
    @RequestMapping(value = "returnString-view.do", method = RequestMethod.POST)
    public String returnStringView(HttpServletRequest request, String name, Integer age){
        // 可以自己手动添加数据到request作用域
        request.setAttribute("name", name);
        request.setAttribute("age", age);
        // show：逻辑视图名称，项目中配置了视图解析器
        // 框架对视图执行forward转发操作
        return "show";
    }

    /**
     * 处理器方法返回String，表示完整视图路径，此时不能再配置视图解析器
     */
    @RequestMapping(value = "returnString-allView.do", method = RequestMethod.POST)
    public String returnString(HttpServletRequest request, String name, Integer age){
        // 可以自己手动添加数据到request作用域
        request.setAttribute("name", name);
        request.setAttribute("age", age);
        // 完整视图路径，项目中不能再配置视图解析器
        // 框架对视图执行forward转发操作
        return "/WEB-INF/view/show.jsp";
    }

    /**
     * 处理器方法返回void，响应ajax请求
     */
    @RequestMapping(value = "returnVoid-ajax.do", method = RequestMethod.POST)
    public void returnVoid(HttpServletResponse response, String name, Integer age) throws IOException {
        // 处理ajax，使用json做数据的格式
        // service调用完成了，使用Student表示处理结果
        Student student = new Student(name, age);
        String json = "";
        // 把结果的对象转为json格式的数据
        if (student != null) {
            ObjectMapper om = new ObjectMapper();
            json = om.writeValueAsString(student);
            System.out.println("student转换的json====" + json);
        }
        // 输出数据，响应ajax的请求
        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.println(json);
        writer.flush();
        writer.close();
    }

    /**
     * 处理器方法返回一个Student，通过框架转为json，响应ajax请求
     * @ResponseBody：
     *  作用：把处理器方法返回的对象转为json后，用过HttpServletResponse输出给浏览器。
     *  位置：在方法的定义上面，和其他注解没有顺序的关系
     */
    @RequestMapping(value = "/returnStudentJson.do")
    @ResponseBody
    public Student doStudentJsonObject(String name, Integer age) {
        // 调用service，获取请求结果数据，Student对象表示结果数据
        Student student = new Student();
        student.setName("李四同学");
        student.setAge(20);
        // 会被框架转为json
        return student;
    }

    /**
     * 处理器方法返回List<Student>
     */
    @RequestMapping(value = "/returnStudentJsonArray.do")
    @ResponseBody
    public List<Student> doStudentJsonArray(String name, Integer age) {
        List<Student> list = new ArrayList<>();
        // 调用service，获取请求结果数据，Student对象表示结果数据
        Student student = new Student();
        student.setName("李四同学");
        student.setAge(20);
        list.add(student);

        student = new Student();
        student.setName("张三");
        student.setAge(28);
        list.add(student);
        // 会被框架转为json
        return list;
    }

    /**
     * 处理器方法返回的是String，String表示数据的，不是视图。
     * 区分返回值String是数据，还是视图，看有没有@ResponseBody注解
     * 如果有@ResponseBody注解，返回String就是数据，反之就是视图
     * 默认使用“text/plain;charset=ISO-8859-1”作为contentType，导致中文有乱码，
     * 解决方案：给RequestMapping增加一个属性produces，使用这个属性指定新的contentType。
     */
    @RequestMapping(value = "/returnStringData.do", produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String doReturnString(){
        return "Hello SpringMVC 返回对象，表示数据";
    }


}