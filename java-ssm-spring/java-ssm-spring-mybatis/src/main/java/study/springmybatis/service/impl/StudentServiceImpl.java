package study.springmybatis.service.impl;

import study.springmybatis.dao.StudentDAO;
import study.springmybatis.model.Student;
import study.springmybatis.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dhl
 * @datetime 2021/7/23  17:47
 */
public class StudentServiceImpl implements StudentService {

    private StudentDAO studentDAO;

    /**
     * 目的：使用set注入，赋值
     */
    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public int insertStudent(Student student) {
        return studentDAO.insertStudent(student);
    }

    @Override
    public List<Student> listStudents() {
        return studentDAO.listStudents();
    }
}