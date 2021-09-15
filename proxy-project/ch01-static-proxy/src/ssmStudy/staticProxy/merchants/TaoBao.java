package ssmStudy.staticProxy.merchants;

import ssmStudy.staticProxy.factory.UsbKingFactory;
import ssmStudy.staticProxy.service.UsbSell;

/**
 * TaoBao类是商家，代理金士顿U盘的销售。
 */
public class TaoBao implements UsbSell {

    // 声明：商家具体代理的是哪个厂家
    private UsbKingFactory factory = new UsbKingFactory();

    @Override
    public float sell(int amount) {
        // 向厂家发送订单，告诉厂家，我买了U盘，厂家发货
        float price = factory.sell(amount);
        // 商家需要加价，也就是代理要增加新的功能
        price += 25;
        // 增加的价格
        return price;
    }
}