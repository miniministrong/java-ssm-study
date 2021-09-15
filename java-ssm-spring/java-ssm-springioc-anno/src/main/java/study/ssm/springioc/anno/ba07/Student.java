package study.ssm.springioc.anno.ba07;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author dhl
 * @datetime 2021/7/20  8:59
 */
@Component("myStudent")
public class Student {
    @Value("张章")
    private String name;
    @Value("20")
    private Integer age;
    @Resource(name = "mySchool")
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

}