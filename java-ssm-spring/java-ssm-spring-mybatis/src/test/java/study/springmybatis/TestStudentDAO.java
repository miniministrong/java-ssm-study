package study.springmybatis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.springmybatis.dao.StudentDAO;
import study.springmybatis.model.Student;

/**
 * @author 汶泽
 * @date 2021/7/24
 */
public class TestStudentDAO {
    @Test
    public void testInsertStudent(){
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        StudentDAO dao = (StudentDAO) context.getBean("studentDAO");
        Student student = new Student();
        student.setId(1008);
        student.setName("周慧");
        student.setEmail("zhouhui@qq.com");
        student.setAge(20);
        int num = dao.insertStudent(student);
        System.out.println("执行结果：" + num);
    }

    @Test
    public void testListStudents(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        StudentDAO dao = (StudentDAO) applicationContext.getBean("studentDAO");
        dao.listStudents().forEach(stu -> System.out.println("学生：" + stu));
    }
}
