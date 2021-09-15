package study.ssm.springioc.anno.ba03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author dhl
 * @datetime 2021/7/20  10:21
 */
@Component("mySchool")
public class School {
    @Value("北京大学")
    private String name;
    @Value("北京海淀区")
    private String address;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}