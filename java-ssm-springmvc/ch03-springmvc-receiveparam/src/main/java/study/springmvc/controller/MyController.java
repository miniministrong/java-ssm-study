package study.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import study.springmvc.vo.Student;

/**
 * @author dhl
 * @datetime 2021/7/26  12:48
 */
@Controller
public class MyController {
    @RequestMapping(value = "/receive.do", method = RequestMethod.POST)
    public ModelAndView receive(String name, Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", age);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping(value = "receiveParam.do", method = RequestMethod.POST)
    public ModelAndView receiveParam(@RequestParam(value = "rname", required = false) String name,
                                     @RequestParam(value = "rage", required = false) Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", age);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping(value = "receiveObject.do", method = RequestMethod.POST)
    public ModelAndView receiveObject(Student student){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", student.getName());
        mv.addObject("age", student.getAge());
        mv.addObject("student", student);
        mv.setViewName("result");
        return mv;
    }
}