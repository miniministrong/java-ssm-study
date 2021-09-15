package study.ssm.springweb.dao;

import org.springframework.stereotype.Repository;
import study.ssm.springweb.model.Student;

import java.util.List;

/**
 * student的dao接口
 *
 * @author 汶泽
 * @date 2021/7/25-16:33
 */
@Repository
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
