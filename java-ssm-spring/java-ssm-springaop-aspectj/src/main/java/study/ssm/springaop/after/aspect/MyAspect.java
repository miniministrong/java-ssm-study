package study.ssm.springaop.after.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author dhl
 * @datetime 2021/7/21  11:22
 */
@Aspect
@Component
public class MyAspect {
    @After("execution(* *..*Impl.do*(..))")
    public void myAfter(){
        System.out.println("最终代码执行，也总是会被执行");
    }
}