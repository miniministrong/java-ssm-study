package study.ssm.springioc.ba02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dhl
 * @datetime 2021/7/19  16:00
 */
public class iocTest {
    /**
     * 一般来说我们赋值的方式
     */
    @Test
    public void test01(){
        Student student = new Student();
        student.setName("李四");
        student.setAge(20);
        School school = new School();
        school.setName("一中");
        school.setAddress("天津");
        student.setSchool(school);
        System.out.println("student:" + student);
    }

    @Test
    public void test02(){
        String config = "ba02/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("myStudent");
        System.out.println("student:" + student);
    }
}