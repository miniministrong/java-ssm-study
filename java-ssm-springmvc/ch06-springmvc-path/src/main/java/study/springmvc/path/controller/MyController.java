package study.springmvc.path.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author dhl
 * @datetime 2021/7/27  11:38
 */
@Controller
public class MyController {
    @RequestMapping(value = "/user/some")
    public ModelAndView doSome(String name, Integer age) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", age);
        mv.setViewName("/index.jsp");
        return mv;
    }
}