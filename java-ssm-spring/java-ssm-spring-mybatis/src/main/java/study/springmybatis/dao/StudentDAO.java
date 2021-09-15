package study.springmybatis.dao;

import study.springmybatis.model.Student;

import java.util.List;

/**
 * student对象的dao接口
 *
 * @author dhl
 * @datetime 2021/7/23  17:31
 */
public interface StudentDAO {
    /**
     * 新增学生对象
     * @param student
     * @return 新增的条数
     */
    int insertStudent(Student student);

    /**
     * 查询数据库中所有的student对象
     * @return 装有student对象的list集合
     */
    List<Student> listStudents();
}
