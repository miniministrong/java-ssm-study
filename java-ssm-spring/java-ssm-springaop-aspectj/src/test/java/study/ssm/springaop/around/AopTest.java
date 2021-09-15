package study.ssm.springaop.around;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import study.ssm.springaop.around.service.SomeService;

/**
 * @author dhl
 * @datetime 2021/7/21  10:44
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AopTest {
    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AopTest.class);
        SomeService service = (SomeService) context.getBean("someServiceImpl");
        String str = service.doFirst("zhangsan", 20);
        System.out.println("方法执行结果：" + str);
    }
}