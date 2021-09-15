package study.ssm.spring.transaction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.ssm.spring.transaction.service.GoodsService;

/**
 * @author 汶泽
 * @date 2021/7/25-14:22
 */
public class TestGoodsServiceImpl {
    @Test
    public void testUpdateGoods(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        GoodsService service = (GoodsService) applicationContext.getBean("goodsService");
        service.updateGoods(1001, 10);
    }
}
