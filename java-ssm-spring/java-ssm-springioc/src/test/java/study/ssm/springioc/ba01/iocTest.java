package study.ssm.springioc.ba01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author dhl
 * @datetime 2021/7/19  15:25
 */
public class iocTest {
    @Test
    public void test01(){
        String config = "ba01/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        // 从容器中获取Student对象
        Student student = (Student) applicationContext.getBean("myStudent");
        System.out.println("student对象:" + student);

        Date date = (Date) applicationContext.getBean("myDate");
        System.out.println(date);

    }
}