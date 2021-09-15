package study.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import study.springmvc.exception.AgeException;
import study.springmvc.exception.MyUserException;
import study.springmvc.exception.NameException;

/**
 * @author dhl
 * @datetime 2021/7/27  17:52
 */
@Controller
public class MyController {
    @RequestMapping("/some")
    public ModelAndView doSome(String name, Integer age) throws MyUserException {
        ModelAndView mv = new ModelAndView();
        // 根据请求参数抛出异常
        if (!"张三".equals(name)) {
            throw new NameException("姓名不正确");
        }
        if (age == null || age > 80) {
            throw new AgeException("年龄不合法");
        }
        mv.addObject("myname", name);
        mv.addObject("myage", age);
        mv.setViewName("show");
        return mv;
    }
}