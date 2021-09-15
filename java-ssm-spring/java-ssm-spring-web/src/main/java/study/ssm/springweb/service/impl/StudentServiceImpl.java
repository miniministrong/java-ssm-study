package study.ssm.springweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import study.ssm.springweb.dao.StudentDAO;
import study.ssm.springweb.model.Student;
import study.ssm.springweb.service.StudentService;

import java.util.List;

/**
 * @author 汶泽
 * @date 2021/7/25-16:36
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    @Qualifier("studentDAO")
    private final StudentDAO studentDAO;

    public StudentServiceImpl(StudentDAO studentDAO) {
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
