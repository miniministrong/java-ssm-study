package study.ssm.springaop.cglib;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author dhl
 * @datetime 2021/7/21  11:50
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class aopTest {
    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(aopTest.class);
        SomeServiceImpl service = (SomeServiceImpl) context.getBean("someServiceImpl");
        // study.ssm.springaop.cglib.SomeServiceImpl$$EnhancerBySpringCGLIB$$c24a4d98
        System.out.println(service.getClass().getName());
        service.doSome();
    }
}