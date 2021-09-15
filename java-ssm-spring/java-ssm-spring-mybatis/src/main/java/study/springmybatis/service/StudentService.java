package study.springmybatis.service;

import study.springmybatis.model.Student;

import java.util.List;

/**
 * Student实体类的Service接口
 *
 * @author dhl
 * @datetime 2021/7/23  17:46
 */
public interface StudentService {
    /**
     * 添加student信息
     * @param student
     * @return 添加成功数目
     */
    int insertStudent(Student student);

    /**
     * 查询所有的student对象信息
     * @return 装有student对象的list集合
     */
    List<Student> listStudents();
}
