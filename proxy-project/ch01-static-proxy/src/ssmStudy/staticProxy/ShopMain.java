package ssmStudy.staticProxy;

import ssmStudy.staticProxy.merchants.TaoBao;
import ssmStudy.staticProxy.merchants.WeChatMerchants;

public class ShopMain {
    public static void main(String[] args) {
        // 创建代理的商家TaoBao对象
        TaoBao taoBao = new TaoBao();
        float price = taoBao.sell(1);
        System.out.println("淘宝商家购买U盘单价：" + price);

        // 创建代理的商家WeChatMerchants对象
        WeChatMerchants wechat = new WeChatMerchants();
        float wechatPrice = wechat.sell(1);
        System.out.println("微商售卖U盘的单价：" + wechatPrice);
    }
}