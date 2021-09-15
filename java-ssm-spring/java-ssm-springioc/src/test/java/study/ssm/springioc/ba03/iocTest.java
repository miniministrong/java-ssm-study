package study.ssm.springioc.ba03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @author dhl
 * @datetime 2021/7/19  16:23
 */
public class iocTest {
    @Test
    public void test01(){
        String config = "ba03/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("myStudent");
        System.out.println("student:" + student);
    }
    @Test
    public void test02(){
        String config = "ba03/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("student");
        System.out.println("student:" + student);
    }
    @Test
    public void test03(){
        String config = "ba03/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("stu");
        System.out.println("student:" + student);
    }

    @Test
    public void test04(){
        String config = "ba03/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        File myFile = (File) applicationContext.getBean("myFile");
        System.out.println(myFile.getName());
    }
}