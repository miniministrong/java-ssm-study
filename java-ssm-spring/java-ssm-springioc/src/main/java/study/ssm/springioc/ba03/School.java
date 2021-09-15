package study.ssm.springioc.ba03;

/**
 * @author dhl
 * @datetime 2021/7/19  15:58
 */
public class School {
    private String name;
    private String address;

    public School() {
        System.out.println("school类的无参构造方法");
    }

    public School(String name, String address) {
        System.out.println("school类的有参构造方法");
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}