package study.ssm.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import study.ssm.mybatis.dao.MyStudentDAO;
import study.ssm.mybatis.model.MyStudent;
import study.ssm.mybatis.utils.MyBatisUtils;

/**
 * @author dhl
 * @datetime 2021/7/23  16:04
 */
public class TestMyStudent {
    @Test
    public void testListStudents(){
        SqlSession session = MyBatisUtils.getSqlSession();
        MyStudentDAO dao = session.getMapper(MyStudentDAO.class);
        dao.listStudents().forEach(stu -> System.out.println("myStudent：" + stu));
        session.close();
    }
}