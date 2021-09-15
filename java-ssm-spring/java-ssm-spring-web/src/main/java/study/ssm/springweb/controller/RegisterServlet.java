package study.ssm.springweb.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import study.ssm.springweb.model.Student;
import study.ssm.springweb.service.StudentService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 注册servlet
 *
 * @author 汶泽
 * @date 2021/7/25-16:53
 */
@WebServlet("/register")
@Controller
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置字符集
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");
        // 获取对应数据
        String strId = request.getParameter("id");
        String strName = request.getParameter("name");
        String strEmail = request.getParameter("email");
        String strAge = request.getParameter("age");
        // 将学生数据加入到学生对象中去
        Student student = new Student();
        student.setId(Integer.parseInt(strId));
        student.setName(strName);
        student.setEmail(strEmail);
        student.setAge(Integer.parseInt(strAge));
        // 创建ApplicationContext对象
        // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        WebApplicationContext context = null;
        // 获取ServletContext中的容器对象，创建好的容器，拿来就用
        /*String key = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
        Object attr = getServletContext().getAttribute(key);
        if (attr != null) {
            context = (WebApplicationContext) attr;
        }*/
        // 使用框架中的方法，获取容器对象
        ServletContext sc = getServletContext();
        context = WebApplicationContextUtils.getWebApplicationContext(sc);
        StudentService service = (StudentService) context.getBean("studentService");
        service.insertStudent(student);
        // 请求转发给其他页面
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}
