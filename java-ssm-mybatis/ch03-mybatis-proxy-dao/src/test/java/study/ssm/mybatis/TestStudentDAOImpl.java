package study.ssm.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import study.ssm.mybatis.dao.StudentDAO;
import study.ssm.mybatis.model.Student;
import study.ssm.mybatis.utils.MyBatisUtils;

/**
 * @author dhl
 * @datetime 2021/7/22  10:40
 */
public class TestStudentDAOImpl {
    @Test
    public void testListStudents(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        // dao : com.sun.proxy.$Proxy5
        System.out.println("dao : " + dao.getClass().getName());
        dao.listStudents().stream()
                .forEach(System.out::println);
    }
    @Test
    public void testInsertStudent(){
        SqlSession session = MyBatisUtils.getSqlSession();
        StudentDAO dao = session.getMapper(StudentDAO.class);
        Student student = new Student();
        student.setId(1007);
        student.setName("袁绍");
        student.setEmail("yuanshao@gmail.com");
        student.setAge(30);
        int nums = dao.insertStudent(student);
        System.out.println("执行结果：" + nums);
        session.close();
    }
}