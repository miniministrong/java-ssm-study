package study.ssm.mybatis.dao.impl;

import org.apache.ibatis.session.SqlSession;
import study.ssm.mybatis.dao.StudentDAO;
import study.ssm.mybatis.model.Student;
import study.ssm.mybatis.utils.MyBatisUtils;

import java.util.List;

/**
 * @author dhl
 * @datetime 2021/7/22  10:33
 */
public class StudentDAOImpl implements StudentDAO {
    /**
     * 查询数据库中所有的学生信息
     * @return 学生集合
     */
    @Override
    public List<Student> listStudents() {
        SqlSession session = MyBatisUtils.getSqlSession();
        String sqlId = "study.ssm.mybatis.dao.StudentDAO.listStudents";
        List<Student> students = session.selectList(sqlId);
        session.close();
        return students;
    }

    /**
     * 添加学生信息
     * @param student 学生对象
     * @return 添加成功条数
     */
    @Override
    public int insertStudent(Student student) {
        SqlSession session = MyBatisUtils.getSqlSession();
        String sqlId = "study.ssm.mybatis.dao.StudentDAO.insertStudent";
        int nums = session.insert(sqlId, student);
        session.close();
        return nums;
    }
}