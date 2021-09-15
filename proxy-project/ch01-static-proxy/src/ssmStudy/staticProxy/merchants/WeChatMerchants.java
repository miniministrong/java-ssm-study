package ssmStudy.staticProxy.merchants;

import ssmStudy.staticProxy.factory.UsbKingFactory;
import ssmStudy.staticProxy.service.UsbSell;

/**
 * 微商
 */
public class WeChatMerchants implements UsbSell {
    private UsbKingFactory factory = new UsbKingFactory();
    @Override
    public float sell(int amount) {
        float price = factory.sell(amount);
        price += 1;
        return price;
    }
}