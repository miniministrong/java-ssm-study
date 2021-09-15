package study.ssm.springaop.afterthrowing.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author dhl
 * @datetime 2021/7/21  11:07
 */
@Aspect
@Component
public class MyAspect {
    @AfterThrowing(value = "execution(* *..*Impl.do*(..))", throwing = "ex")
    public void myAfterThrowing(Exception ex){
        System.out.println("异常通知：执行时发生异常 : " + ex.getMessage());
    }
}