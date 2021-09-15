package study.ssm.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * mybatis工具类
 *
 * @author dhl
 * @datetime 2021/7/22  9:24
 */
public class MyBatisUtils {
    private static SqlSessionFactory factory = null;

    /**
     * 使用静态代码块是因为我们的SqlSessionFactory对象是比较重量级的，只需要创建一次就可以了，因此我们在下面的方法使用中不用再去创建SqlSessionFactory对象
     */
    static {
        String config = "mybatis.xml";
        try {
            InputStream in = Resources.getResourceAsStream(config);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            factory = builder.build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession() {
        SqlSession session = null;
        if (factory != null) {
            session = factory.openSession(true);
        }
        return session;
    }
}