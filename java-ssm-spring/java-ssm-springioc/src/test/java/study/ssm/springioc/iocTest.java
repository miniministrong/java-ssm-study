package study.ssm.springioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.ssm.springioc.service.HelloService;
import study.ssm.springioc.service.impl.HelloServiceImpl;

import java.util.Date;

/**
 * @author dhl
 * @datetime 2021/7/19  14:01
 */
public class iocTest {
    /**
     * 正常我们来创建对象的方式
     */
    @Test
    public void test01(){
        HelloService helloService = new HelloServiceImpl();
        helloService.hello();
    }

    /**
     * 使用spring容器创建对象
     */
    @Test
    public void test02(){
        // 指定spring配置文件的名称
        String config = "beans.xml";
        // 创建表示spring容器的对象，ApplicationContext
        // ApplicationContext就表示容器，通过这个容器就可以获取对象了
        // ClassPathXmlApplicationContext：表示从类路径中，加载spring的配置文件的
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        // 从容器中获取对象，需要调用方法
        // getBean("配置文件中的id值")
        HelloService service = (HelloService) applicationContext.getBean("helloService");
        HelloService bean = applicationContext.getBean(HelloServiceImpl.class);
        service.hello();
        bean.hello();
    }

    /**
     * 获取spring容器中创建java对象的信息
     */
    @Test
    public void test03(){
        String config = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        // 获取spring容器中创建对象的数量
        int nums = applicationContext.getBeanDefinitionCount();
        System.out.println("容器中创建对象的数量：" + nums);
        // 获取容器中每一个定义了的对象的名称
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("容器中定义对象的名称：" + name);
        }
    }

    /**
     * 创建一个非自定义的对象
     */
    @Test
    public void test05(){
        String config = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        // 获取对象
        Date my = (Date) applicationContext.getBean("myDate");
        System.out.println("Date:" + my);

    }


}