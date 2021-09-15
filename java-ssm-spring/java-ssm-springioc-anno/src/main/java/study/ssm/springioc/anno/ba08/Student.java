package study.ssm.springioc.anno.ba08;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author dhl
 * @datetime 2021/7/20  8:59
 */
@Component("myStudent")
public class Student {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}