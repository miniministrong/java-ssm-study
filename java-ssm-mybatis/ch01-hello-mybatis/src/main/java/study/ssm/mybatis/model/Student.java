package study.ssm.mybatis.model;

import java.util.Objects;

/**
 * 学生实体类
 *
 * @author dhl
 * @datetime 2021/7/21  15:38
 */
public class Student {
    /**
     * 学生编号
     */
    private Integer id;
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 学生邮箱
     */
    private String email;
    /**
     * 学生年龄
     */
    private Integer age;

    public Student() {
    }

    public Student(Integer id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 重写toString()
     * @return
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return getId().equals(student.getId()) && getName().equals(student.getName()) && getEmail().equals(student.getEmail()) && getAge().equals(student.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmail(), getAge());
    }
}