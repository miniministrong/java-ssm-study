package study.ssm.springioc.anno.ba01;

import org.springframework.stereotype.Component;



/**
 * @Component 可以用来创建对象，整个容器只存在一个，放在类的上面
 *  value：表示bean的id值
 */
// @Component(value = "myStudent")
@Component("myStudent")/*常用*/
// @Component
/**
 * @author dhl
 * @datetime 2021/7/20  8:59
 */
public class Student {
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
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