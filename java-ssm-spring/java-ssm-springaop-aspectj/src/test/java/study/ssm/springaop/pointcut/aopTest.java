package study.ssm.springaop.pointcut;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import study.ssm.springaop.pointcut.service.SomeService;

/**
 * @author dhl
 * @datetime 2021/7/21  11:41
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class aopTest {
    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(aopTest.class);
        SomeService service = (SomeService) context.getBean("someServiceImpl");
        service.doSome();
    }
}