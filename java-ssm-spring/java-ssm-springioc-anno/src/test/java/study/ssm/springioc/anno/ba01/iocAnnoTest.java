package study.ssm.springioc.anno.ba01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dhl
 * @datetime 2021/7/20  9:28
 */
public class iocAnnoTest {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("student");
        System.out.println("student = " + student);
    }
}