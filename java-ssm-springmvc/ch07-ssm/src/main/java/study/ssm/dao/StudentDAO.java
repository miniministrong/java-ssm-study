package study.ssm.dao;

import study.ssm.model.Student;

import java.util.List;

/**
 * student表的增删改查接口
 *
 * @author dhl
 * @datetime 2021/7/27  15:15
 */
public interface StudentDAO {
    /**
     * 添加学生对象
     * @param student
     * @return 添加成功的条数
     */
    int insertStudent(Student student);

    /**
     * 查询所有学生
     * @return 装有student对象的list集合
     */
    List<Student> listStudents();
}
