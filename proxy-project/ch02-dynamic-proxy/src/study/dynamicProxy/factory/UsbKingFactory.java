package study.dynamicProxy.factory;

import study.dynamicProxy.service.UsbSell;
// 目标类
public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        return 85.0f;
    }
}
