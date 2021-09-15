package study.ssm.springaop.before.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;

/**
 * @author dhl
 * @datetime 2021/7/20  16:16
 */
@Aspect
@Component("myAspect")
public class MyAspect {
    /*@Before("execution(public void study.ssm.springaop.before.service.impl.SomeServiceImpl.doSome(String, Integer))")
    public void myBefore(){
        // 切面要执行的功能代码
        System.out.println("前置通知，切面功能：在目标方法之前输出时间：" + new Date());
    }*/

    @Before("execution(* *..*ServiceImpl.doSome(..))")
    public void myBefore(JoinPoint jp){
        // 获取方法的定义
        System.out.println("方法的签名（定义）：" + jp.getSignature());
        System.out.println("方法的名称：" + jp.getSignature().getName());
        // 获取方法的参数
        Arrays.stream(jp.getArgs()).forEach(System.out::println);
        // 切面要执行的功能代码
        System.out.println("前置通知，切面功能：在目标方法之前输出时间：" + new Date());
    }
}