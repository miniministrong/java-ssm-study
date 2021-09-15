package study.ssm.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import study.ssm.mybatis.model.Student;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author dhl
 * @datetime 2021/7/21  17:05
 */
public class MyApp {
    public static void main(String[] args) throws IOException {
        // 访问mybatis读取student数据
        // 1.定义mybatis主配置文件的名称，从类路径的根开始
        String config = "mybatis.xml";
        // 2.读取这个config表示的文件
        InputStream in = Resources.getResourceAsStream(config);
        // 3.创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 4.创建SqlSessionFactory对象
        SqlSessionFactory factory = builder.build(in);
        // 5.获取SqlSession对象，从SqlSessionFactory中获取SqlSession
        SqlSession session = factory.openSession();
        // 6.指定要执行的sql语句的标识。sql映射文件中的namespace + "." + 标签的id值
        String sqlId = "study.ssm.mybatis.dao.StudentDAO.listStudents";
        // 7.执行sql语句，通过sqlId找到语句
        List<Student> students = session.selectList(sqlId);
        // 8.输出结果
        students.forEach(stu -> System.out.println("查询的学生：" + stu));
        // 9.关闭资源
        session.close();
    }
}