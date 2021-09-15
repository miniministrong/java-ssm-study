package study.springmvc.urlpattern.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author dhl
 * @datetime 2021/7/27  9:17
 */
@Controller
public class MyController {

    @RequestMapping(value = "/some.do", method = RequestMethod.POST)
    public ModelAndView doSome(String name, Integer age) {
        System.out.println("doSome 's name : " + name + ", age : "  + age);
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", age);
        mv.setViewName("show");
        return mv;
    }

}