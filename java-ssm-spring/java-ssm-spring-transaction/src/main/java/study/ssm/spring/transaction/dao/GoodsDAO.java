package study.ssm.spring.transaction.dao;

import study.ssm.spring.transaction.model.Goods;

/**
 * goods表的dao接口
 *
 * @author 汶泽
 * @date 2021/7/25-13:37
 */
public interface GoodsDAO {

    /**
     * 更新库存
     * @param goods 本次用户购买的商品信息，id，购买数量
     * @return
     */
    int updateGoods(Goods goods);

    /**
     * 查询商品的信息
     * @param id 商品id
     * @return goods对象
     */
    Goods getGoods(Integer id);
}
