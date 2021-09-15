package study.springmybatis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.springmybatis.model.Student;
import study.springmybatis.service.StudentService;

/**
 * @author 汶泽
 * @date 2021/7/24
 */
public class TestStudentService {
    @Test
    public void testInsertStudent(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        Student student = new Student(1010, "周天子", "zhoutianzi@gmail.com", 20);
        int num = studentService.insertStudent(student);
        // 在spring整合mybatis中，mybatis是自动提交的，不用手动去SqlSession.commit()提交了
        System.out.println("执行结果：" + num);
    }

    @Test
    public void testListStudents(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        studentService.listStudents().forEach(stu -> System.out.println("学生：" + stu));
    }

}
