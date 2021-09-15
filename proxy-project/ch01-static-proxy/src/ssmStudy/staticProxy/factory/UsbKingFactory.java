package ssmStudy.staticProxy.factory;

import ssmStudy.staticProxy.service.UsbSell;

/**
 * 目标类：金士顿U盘
 */
public class UsbKingFactory implements UsbSell {

    @Override
    public float sell(int amount) {
        // 一个128G的U盘是 85元
        return 85.0f;
    }
}