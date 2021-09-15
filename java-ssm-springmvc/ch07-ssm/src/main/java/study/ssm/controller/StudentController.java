package study.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import study.ssm.model.Student;
import study.ssm.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dhl
 * @datetime 2021/7/27  15:23
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    /**
     * 增加学生对象
     * @param student
     * @return
     */
    @RequestMapping(value = "/insertStudent")
    public ModelAndView insertStudent(Student student){
        ModelAndView mv = new ModelAndView();
        String tips = "注册失败";
        int nums = studentService.insertStudent(student);
        if (nums > 0) {
            tips ="学生【" + student.getName() + "】注册成功";
        }
        mv.addObject("tips", tips);
        mv.setViewName("result");
        return mv;
    }

    /**
     * 查询所有学生
     * @return 学生集合
     */
    @RequestMapping(value = "/listStudents")
    @ResponseBody
    public List<Student> listStudents(){
        return studentService.listStudents();
    }
}