package study.ssm.service.impl;

import org.springframework.stereotype.Service;
import study.ssm.dao.StudentDAO;
import study.ssm.model.Student;
import study.ssm.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dhl
 * @datetime 2021/7/27  15:21
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDAO studentDAO;
    @Override
    public int insertStudent(Student student) {
        return studentDAO.insertStudent(student);
    }

    @Override
    public List<Student> listStudents() {
        return studentDAO.listStudents();
    }
}