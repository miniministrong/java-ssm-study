package study.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



/**
 * @Controller: 创建处理器对象，对象放在SpringMVC容器中。
 * 位置：在类的上面
 * 和spring中的@Service，@Component
 * 能处理请求的都是控制器（处理器）：MyController能处理请求，叫做后端控制器（back controller）
 */
@Controller
/**
 * @author dhl
 * @datetime 2021/7/26  9:16
 */
public class MyController {
    /**
     * 准备使用doSome方法处理some.do请求
     * @RequestMapping: 请求映射，作用是把一个请求地址和一个方法绑定在一起。一个请求指定一个方法处理。
     *  属性：value是一个String，表示请求的uri地址的(some.do)。value的值必须是唯一的，不能重复。在使用时，推荐以"/"开始
     *  位置：1、在方法的上面，常用的。2、在类的上面
     *  说明：使用RequestMapping修饰的方法叫做处理器方法或者控制器方法。
     *  使用@RequestMapping修饰的方法可以处理请求的，类似于Servlet中的doGet，doPost
     *  返回值：ModelAndView 表示本次请求的处理结果
     *  Model：数据，请求处理完成后，要显示给用户的数据
     *  View：视图，比如jsp等等。
     */
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        // 处理some.do请求了，相当于service调用处理完成了。
        ModelAndView mv = new ModelAndView();
        // 添加数据，框架在请求的最后把数据放入到了request作用域
        mv.addObject("msg", "这是第一个SpringMVC项目");
        mv.addObject("fun", "执行了doSome方法");

        // 指定视图，指定视图的完整路径。相当于使用了请求转发
        // mv.setViewName("/result.jsp");
        // mv.setViewName("/WEB-INF/view/result.jsp");

        // 当使用了视图解析器后，可以使用逻辑名称（文件名），指定视图
        // 框架会使用视图解析器的前缀 + 逻辑名称 + 后缀组成完整路径，这里就是字符连接操作
        // WEB-INF/view + result + .jsp

        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("/other.do")
    public ModelAndView doOther(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "这是SpringMVC的other.do");
        mv.addObject("fun", "执行了doOther方法");
        mv.setViewName("other");
        return mv;
    }
}