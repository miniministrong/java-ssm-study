package study.ssm.mybatis;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import study.ssm.mybatis.dao.StudentDAO;
import study.ssm.mybatis.model.Student;
import study.ssm.mybatis.utils.MyBatisUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dhl
 * @datetime 2021/7/22  10:40
 */
public class TestStudentDAOImpl {
    @Test
    public void testListStudentsUseIf(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        Student student = new Student();
        student.setName("李四");
        student.setAge(20);
        dao.listStudentsUseIf(student)
                .forEach(stu -> System.out.println("学生：" + stu));
        session.close();
    }

    @Test
    public void testListStudentsUseWhere(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        Student student = new Student();
        student.setName("李四");
        student.setAge(20);
        dao.listStudentsUseWhere(student).forEach(stu -> System.out.println("学生：" + stu));
        session.close();
    }

    @Test
    public void testListStudentsForSim(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1003);
        list.add(1004);
        list.add(1005);
        list.add(1006);
        dao.listStudentsForSim(list).forEach(stu -> System.out.println("学生：" + stu));
        session.close();
    }

    @Test
    public void testListStudentForStudent(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        List<Student> students = new ArrayList<>();
        Student student  = new Student();
        student.setId(1001);
        student.setName("张飞");
        students.add(student);
        student = new Student();
        student.setId(1002);
        student.setName("关羽");
        students.add(student);
        dao.listStudentForStudent(students).forEach(stu -> System.out.println("学生：" + stu));
        session.close();
    }

    @Test
    public void testListStudentsUsePageHelper(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        // 添加PageHelper方法的调用
        PageHelper.startPage(3, 3);
        dao.listStudentsUsePageHelper()
                .forEach(stu -> System.out.println("学生信息：" + stu));
        session.close();
    }

}