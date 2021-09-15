package study.ssm.mybatis;

import org.junit.Test;
import study.ssm.mybatis.dao.StudentDAO;
import study.ssm.mybatis.dao.impl.StudentDAOImpl;
import study.ssm.mybatis.model.Student;

/**
 * @author dhl
 * @datetime 2021/7/22  10:40
 */
public class TestStudentDAOImpl {
    @Test
    public void testListStudents(){
        StudentDAO studentDAO = new StudentDAOImpl();
        studentDAO.listStudents().stream()
                .forEach(System.out::println);
    }
    @Test
    public void testInsertStudent(){
        Student student = new Student();
        student.setId(1006);
        student.setName("曹操");
        student.setEmail("caocao@qq.com");
        student.setAge(28);
        StudentDAO studentDAO = new StudentDAOImpl();
        int nums = studentDAO.insertStudent(student);
        System.out.println(nums);
    }
}