package study.ssm.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import study.ssm.mybatis.model.Student;
import study.ssm.mybatis.utils.MyBatisUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author dhl
 * @datetime 2021/7/21  17:40
 */
public class TestMyBatis {
    // 自己提交事务的插入方法
    @Test
    public void test01() throws IOException {
        String config = "mybatis.xml";
        InputStream in = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        String sqlId = "study.ssm.mybatis.dao.StudentDAO.insertStudent";
        Student student = new Student();
        student.setId(1003);
        student.setName("张飞");
        student.setEmail("zhangfei@163.com");
        student.setAge(20);
        int count = session.insert(sqlId, student);
        session.commit();
        System.out.println("运行结果：" + count);
        session.close();
    }
    // 自动提交事务的插入数据的方法
    @Test
    public void test02() throws IOException {
        String config = "mybatis.xml";
        InputStream in = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession(true);
        String sqlId = "study.ssm.mybatis.dao.StudentDAO.insertStudent";
        Student student = new Student();
        student.setId(1005);
        student.setName("关羽");
        student.setEmail("guanyu@163.com");
        student.setAge(23);
        int nums = session.insert(sqlId, student);
        System.out.println("执行结果：" + nums);
        session.close();
    }

    // 使用mybatis工具类完成我们的查询任务
    @Test
    public void test03(){
        SqlSession session = MyBatisUtils.getSqlSession();
        String sqlId = "study.ssm.mybatis.dao.StudentDAO.listStudents";
        List<Student> students = session.selectList(sqlId);
        students.forEach(stu -> System.out.println(stu));
    }
}