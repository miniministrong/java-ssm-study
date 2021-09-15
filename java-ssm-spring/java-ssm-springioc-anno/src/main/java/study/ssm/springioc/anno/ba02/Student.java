package study.ssm.springioc.anno.ba02;

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
    private Integer age;

    @Value("80")
    public void setAge(Integer age) {
        System.out.println("setAge:" + age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}