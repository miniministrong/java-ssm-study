package study.ssm.spring.transaction.service.impl;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import study.ssm.spring.transaction.dao.GoodsDAO;
import study.ssm.spring.transaction.dao.SaleDAO;
import study.ssm.spring.transaction.exception.NotEnoughException;
import study.ssm.spring.transaction.model.Goods;
import study.ssm.spring.transaction.model.Sale;
import study.ssm.spring.transaction.service.GoodsService;

/**
 * @author 汶泽
 * @date 2021/7/25-13:54
 */
public class GoodsServiceImpl implements GoodsService {
    private GoodsDAO goodsDAO;
    private SaleDAO saleDAO;

    public void setSaleDAO(SaleDAO saleDAO) {
        this.saleDAO = saleDAO;
    }

    public void setGoodsDAO(GoodsDAO goodsDAO) {
        this.goodsDAO = goodsDAO;
    }

    public void addGoods(){}
    public void addSale(){}

    public void modifyGoods(){}
    public void modifySale(){}

    public void removeGoods(){}
    public void removeSale(){}

    public void queryGoods(){}
    public void searchSale(){}

    /**
     * 事务的注解，设置事务的传播行为，事务的隔离级别，事务的是否只读，事务回滚的异常
     */
    /*@Transactional(
            propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            readOnly = false,
            rollbackFor = {
                    NullPointerException.class,
                    NotEnoughException.class
            }
    )*/
    // 因为我们上面使用的都是默认值，默认传播行为：REQUIRED，默认隔离级别：DEFAULT，
    // 默认readOnly：false，默认在运行时异常时事务进行回滚
    // @Transactional
    @Override
    public void updateGoods(Integer goodsId, Integer nums) {
        // 记录销售信息，向sale表中添加数据
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDAO.insertSale(sale);
        // 更新库存
        Goods goods = goodsDAO.getGoods(goodsId);
        if (goods == null) {
            // 商品不存在
            throw new NullPointerException("商品编号为：" + goodsId + "的商品不存在");
        }else if (goods.getAmount() < nums){
            // 商品库存不足
            throw new NotEnoughException("商品编号为：" + goodsId + "的商品库存不足");
        }
        // 修改库存
        Goods newGoods = new Goods();
        newGoods.setId(goodsId);
        newGoods.setAmount(nums);
        goodsDAO.updateGoods(newGoods);
    }
}
