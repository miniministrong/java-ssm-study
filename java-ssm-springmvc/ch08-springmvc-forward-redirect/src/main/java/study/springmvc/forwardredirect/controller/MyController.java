package study.springmvc.forwardredirect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author dhl
 * @datetime 2021/7/27  17:06
 */
@Controller
public class MyController {
    /**
     * 处理器方法返回ModelAndView，实现转发forward
     */
    @RequestMapping("/forward")
    public ModelAndView forward(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "实现forward操作");
        mv.addObject("fun", "forward方法执行");
        // 显示转发
        mv.setViewName("forward:/WEB-INF/jsp/hello.jsp");
        return mv;
    }

    /**
     * 处理器方法返回ModelAndView，实现转发redirect
     */
    @RequestMapping("/redirect")
    public ModelAndView redirect(String name, Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname", name);
        mv.addObject("myage", age);
        // 显示转发
        mv.setViewName("redirect:/hello.jsp");
        return mv;
    }
}