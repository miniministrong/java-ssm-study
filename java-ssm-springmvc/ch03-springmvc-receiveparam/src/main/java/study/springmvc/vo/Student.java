package study.springmvc.vo;

/**
 * 保存请求参数的一个普通java对象
 *
 * @author dhl
 * @datetime 2021/7/26  14:12
 */
public class Student {
    private String name;
    private Integer age;

    public Student() {
        System.out.println("Student的无参数构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName:" + name);
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

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