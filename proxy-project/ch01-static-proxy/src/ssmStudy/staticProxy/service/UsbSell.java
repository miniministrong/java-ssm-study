package ssmStudy.staticProxy.service;

/**
 * 卖U盘的接口，是我们的商家、厂家都要实现的接口
 */
public interface UsbSell {
    /**
     *卖U盘的方法
     * @param amount 表示一次购买的数量，暂时不用
     * @return 表示一个U盘的价格
     */
    float sell(int amount);
}