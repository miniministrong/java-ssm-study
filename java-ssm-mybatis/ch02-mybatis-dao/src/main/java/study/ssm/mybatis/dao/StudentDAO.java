package study.ssm.mybatis.dao;

import study.ssm.mybatis.model.Student;

import java.util.List;

/**
 * 对数据库student表中的数据进行操作
 *
 * @author dhl
 * @datetime 2021/7/22  10:01
 */
public interface StudentDAO {

    /**
     * 查询所有student对象，并打包成为一个集合
     * @return student对象的集合
     */
    List<Student> listStudents();

    /**
     * 添加学生信息
     * @param student 学生对象
     * @return 添加成功数目
     */
    int insertStudent(Student student);
}
