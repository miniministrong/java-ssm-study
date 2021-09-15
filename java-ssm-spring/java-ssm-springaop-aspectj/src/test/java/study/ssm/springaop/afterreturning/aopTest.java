package study.ssm.springaop.afterreturning;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import study.ssm.springaop.afterreturning.model.User;
import study.ssm.springaop.afterreturning.service.SomeService;
import study.ssm.springaop.afterreturning.service.impl.SomeServiceImpl;

/**
 * @author dhl
 * @datetime 2021/7/21  9:53
 */
@ComponentScan
@Configuration
@EnableAspectJAutoProxy
public class aopTest {
    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(aopTest.class);
        SomeService service = (SomeService) context.getBean("someServiceImpl");
        service.doOther("张三", 20);
        System.out.println("=====================================");
        User user = service.doUser("乌迪尔", 10000);
        System.out.println("user:" + user);
        System.out.println("------------------------------------");
        user.setName("张撒");
        user.setAge(40);
        System.out.println(user);
    }
}