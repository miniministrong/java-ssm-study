package study.ssm.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import study.ssm.mybatis.dao.StudentDAO;
import study.ssm.mybatis.model.Student;
import study.ssm.mybatis.utils.MyBatisUtils;
import study.ssm.mybatis.vo.QueryParam;

import java.util.HashMap;
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
    public void testListMultiObjects(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        QueryParam param = new QueryParam();
        param.setParamName("关羽");
        param.setParamAge(25);
        dao.listMultiObjects(param).stream()
                .forEach(System.out::println);
        session.close();
    }

    @Test
    public void testListMultiPosition(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        dao.listMultiPosition("张三", 28).stream().
                forEach(System.out::println);
        session.close();
    }

    @Test
    public void testListMultiMap(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", 28);
        dao.listMultiMap(map).forEach(stu -> System.out.println("学生=" + stu));
        session.close();
    }

    @Test
    public void testListStudentsUse$(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        dao.listStudentsUse$("name", "张三", 28, "age", "desc").forEach(stu -> System.out.println("学生=" + stu));
        session.close();
    }
}