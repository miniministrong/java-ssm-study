package study.ssm.springioc.ba06;

/**
 * @author dhl
 * @datetime 2021/7/19  15:23
 */
public class Student {
    private String name;
    private int age;
    // 声明一个引用类型
    private School school;

    public void setName(String name) {
        // System.out.println("setName : " + name);
        this.name = name;
    }

    public void setAge(int age) {
        // System.out.println("setAge : " + age);
        this.age = age;
    }

    public void setSchool(School school) {
        System.out.println("setSchool : " + school);
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}