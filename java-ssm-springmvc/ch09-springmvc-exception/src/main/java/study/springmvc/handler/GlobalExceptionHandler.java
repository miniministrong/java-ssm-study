package study.springmvc.handler;

/**
 * @author dhl
 * @datetime 2021/7/27  18:07
 */

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import study.springmvc.exception.AgeException;
import study.springmvc.exception.NameException;

@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 处理异常的方法和控制器方法的定义一样，可以有多个参数，可以有ModelAndView，String，void，对象类型的返回值
     * @param exception 表示Controller中抛出的异常对象，通过形参可以获取发生的异常信息
     * @return
     */
    @ExceptionHandler(value = NameException.class)
    public ModelAndView doNameException(Exception exception) {
        // 处理NameException的异常
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "姓名必须是“张三”，其他用户不能访问");
        mv.addObject("exception", exception);
        mv.setViewName("nameError");
        return mv;
    }

    @ExceptionHandler(value = AgeException.class)
    public ModelAndView doAgeException(Exception exception) {
        // 处理AgeException的异常
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "您的年龄不能大于80");
        mv.addObject("exception", exception);
        mv.setViewName("ageError");
        return mv;
    }

    /**
     * 处理其他异常，NameException，AgeException以外的，其他的异常
     */
    @ExceptionHandler
    public ModelAndView doOtherException(Exception exception){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "其他类型的异常");
        mv.addObject("exception", exception);
        mv.setViewName("defaultError");
        return mv;
    }
}