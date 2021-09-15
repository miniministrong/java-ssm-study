package study.ssm.springioc.ba01;

/**
 * @author dhl
 * @datetime 2021/7/19  15:23
 */
public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        System.out.println("setName : " + name);
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("setAge : " + age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setEmail(String email) {
        System.out.println("setEmail : " + email);
    }
}