package study.ssm.springioc.anno.ba04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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
    @Autowired
    @Qualifier("mySchool")
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