package study.ssm.springweb.service;

import study.ssm.springweb.model.Student;

import java.util.List;

/**
 * student的service接口
 *
 * @author 汶泽
 * @date 2021/7/25-16:35
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
