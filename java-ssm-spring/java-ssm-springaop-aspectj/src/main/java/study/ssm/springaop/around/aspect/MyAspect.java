package study.ssm.springaop.around.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
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
    @Around("execution(* *..*Impl.do*(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        Object result = null;
        Object[] objs = pjp.getArgs();
        String firstParam = "";
        if (objs != null && objs.length > 1) {
            firstParam = (String) objs[0];
        }
        System.out.println("环绕通知：方法执行之前，打印时间：" + new Date());
        if ("zhangsan".equals(firstParam)) {
            result = pjp.proceed();
        } else {
            result = "Hello AspectJ AOP";
        }
        System.out.println("环绕通知：方法执行之后，提交事务");
        return result;
    }
}