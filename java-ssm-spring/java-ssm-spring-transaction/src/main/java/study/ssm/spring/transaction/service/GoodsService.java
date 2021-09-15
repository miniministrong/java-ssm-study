package study.ssm.spring.transaction.service;

import study.ssm.spring.transaction.model.Goods;

/**
 * goods的service层接口
 *
 * @author 汶泽
 * @date 2021/7/25-13:53
 */
public interface GoodsService {
    /**
     * 购买商品的方法
     * @param goodsId 商品id
     * @param nums 购买数量
     */
    void updateGoods(Integer goodsId, Integer nums);
}
