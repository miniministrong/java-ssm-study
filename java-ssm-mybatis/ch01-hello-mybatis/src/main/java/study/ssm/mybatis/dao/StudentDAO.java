package study.ssm.mybatis.dao;

import study.ssm.mybatis.model.Student;

import java.util.List;

/**
 * 学生操作数据库接口
 *
 * @author dhl
 * @datetime 2021/7/21  15:53
 */
public interface StudentDAO {
    /**
     * 将我们所有查找到的Student对象，转变为一个集合存储
     * @return Student对象的集合
     */
    public List<Student> listStudents();

    /**
     * 插入学生对象
     * @param student 学生对象
     * @return 成功条数
     */
    public int insertStudent(Student student);
}
