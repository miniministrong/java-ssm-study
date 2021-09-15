package study.ssm.springaop.before;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.ssm.springaop.before.service.SomeService;
import study.ssm.springaop.before.service.impl.SomeServiceImpl;

/**
 * @author dhl
 * @datetime 2021/7/20  16:31
 */

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class aopTest {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) applicationContext.getBean("someServiceImpl");
        someService.doSome("张三", 20);
    }

    @Test
    public void test02(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(aopTest.class);
        SomeService service = (SomeService) applicationContext.getBean("someServiceImpl");
        service.doSome("李四", 25);
    }
}