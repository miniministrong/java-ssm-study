package study.ssm.springioc.ba06;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dhl
 * @datetime 2021/7/19  18:18
 */
public class iocTest {
    @Test
    public void test01(){
        String config = "ba06/spring-total.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("myStudent");
        System.out.println("student :" + student);
    }
}