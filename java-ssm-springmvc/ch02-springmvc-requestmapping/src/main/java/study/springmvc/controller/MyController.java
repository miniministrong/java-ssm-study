package study.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author dhl
 * @datetime 2021/7/26  11:31
 */
@Controller
@RequestMapping(value = "/user")
public class MyController {
    @RequestMapping(value = "/some.do", method = RequestMethod.GET)
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "this is springmvc project");
        mv.addObject("fun", "doSome method execute");
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/other.do", method = RequestMethod.POST)
    public ModelAndView doOther(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "this is springmvc project");
        mv.addObject("fun", "doOther method execute");
        mv.setViewName("other");
        return mv;
    }

    @RequestMapping("/first.do")
    public ModelAndView doFirst(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "this is springmvc project");
        mv.addObject("fun", "doFirst method execute");
        mv.setViewName("other");
        return mv;
    }
}