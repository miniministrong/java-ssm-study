package study.ssm.service;

import study.ssm.model.Student;

import java.util.List;

/**
 * student的service接口
 * @author dhl
 * @datetime 2021/7/27  15:20
 */
public interface StudentService {
    /**
     * 增加学生对象
     * @param student
     * @return
     */
    int insertStudent(Student student);

    /**
     * 查询所有学生
     * @return
     */
    List<Student> listStudents();
}
