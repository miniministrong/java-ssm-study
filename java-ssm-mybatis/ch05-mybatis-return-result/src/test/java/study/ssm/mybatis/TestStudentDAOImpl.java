package study.ssm.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import study.ssm.mybatis.dao.StudentDAO;
import study.ssm.mybatis.model.Student;
import study.ssm.mybatis.utils.MyBatisUtils;
import study.ssm.mybatis.vo.ViewStudent;

import java.util.List;
import java.util.Map;

/**
 * @author dhl
 * @datetime 2021/7/22  10:40
 */
public class TestStudentDAOImpl {
    @Test
    public void testGetStudentById(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        Student student = dao.getStudentById(1003);
        System.out.println(student);
        session.close();
    }
    @Test
    public void testListMultiStudents(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        dao.listMultiStudents("李四", 28).stream()
                .forEach(System.out::println);
        session.close();
    }

    @Test
    public void testCountStudent(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        int count = dao.countStudents();
        System.out.println("学生数量：" + count);
    }

    @Test
    public void testGetStudentReturnViewStudent(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        ViewStudent student = dao.getStudentReturnViewStudent(1006);
        System.out.println("viewStudent = " + student);
    }

    @Test
    public void testGetStudentMap(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        Map<Object, Object> map = dao.getStudentMap(1006);
        System.out.println("map====" + map);
    }

    @Test
    public void testListStudentsResultMap(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        dao.listStudentsResultMap().forEach(stu -> System.out.println("学生==" + stu));
    }

    @Test
    public void testListMyStudent(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        dao.listMyStudent().forEach(s -> System.out.println("myStudent == " + s));
    }

    @Test
    public void testListMyStudentUseAs(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        dao.listMyStudentUseAs().forEach(stu -> System.out.println("学生========" + stu));
    }

    @Test
    public void testListStudentsLikeJava(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        dao.listStudentsLikeJava("%张%").forEach(stu -> System.out.println("学生：" + stu));
        session.close();
    }

    @Test
    public void testListStudentsLikeJoin(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        dao.listStudentsLikeJoin("张").forEach(stu -> System.out.println("学生==" + stu));
        session.close();
    }
}