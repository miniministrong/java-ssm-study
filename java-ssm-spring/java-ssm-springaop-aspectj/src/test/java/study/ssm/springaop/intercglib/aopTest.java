package study.ssm.springaop.intercglib;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author dhl
 * @datetime 2021/7/21  11:55
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class aopTest {
    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(aopTest.class);
        SomeService service = (SomeService) context.getBean("someServiceImpl");
        // study.ssm.springaop.intercglib.impl.SomeServiceImpl$$EnhancerBySpringCGLIB$$98868f2a
        System.out.println(service.getClass().getName());
        service.doSome();
    }
}