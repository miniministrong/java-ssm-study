package study.ssm.springaop.intercglib.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author dhl
 * @datetime 2021/7/21  11:54
 */
@Aspect
@Component
public class MyAspect {
    @After("myPointcut()")
    public void myAfter(){
        System.out.println("最终通知，总是被执行");
    }
    @Before("myPointcut()")
    public void myBefore(){
        System.out.println("前置通知，在方法执行前被执行");
    }

    @Pointcut("execution(* *..*Impl.do*(..))")
    private void myPointcut(){}
}