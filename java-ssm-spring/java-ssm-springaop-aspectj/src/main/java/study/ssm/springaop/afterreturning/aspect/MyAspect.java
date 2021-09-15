package study.ssm.springaop.afterreturning.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author dhl
 * @datetime 2021/7/20  16:16
 */
@Aspect
@Component("myAspect")
public class MyAspect {
    @Before("execution(* *..*ServiceImpl.doSome(..))")
    public void myBefore(JoinPoint jp){
        // 切面要执行的功能代码
        System.out.println("前置通知，切面功能：在目标方法之前输出时间：" + new Date());
    }

    @AfterReturning(value = "execution(* *..*Impl.do*(..))", returning = "result")
    public void myAfterReturning(Object result) {
        System.out.println("后置通知，方法的返回值是：" + result);
    }

    @AfterReturning(value = "execution(* *..SomeServiceImpl.doUser(String, Integer))", returning = "result")
    public void myAfterReturningByUser(Object result) {
        System.out.println("User：" + result);

        if (result != null) {

        }
    }
}