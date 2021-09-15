package study.ssm.springioc.ba05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dhl
 * @datetime 2021/7/19  17:48
 */
public class iocTest {
    @Test
    public void test01(){
        String config = "ba05/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("myStudent");
        System.out.println("student:" + student);
    }

    @Test
    public void test02(){
        String config = "ba05/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("myStudent");
        System.out.println("student: " + student);
    }
}