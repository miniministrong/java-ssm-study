package study.ssm.spring.transaction.dao;

import study.ssm.spring.transaction.model.Sale;

/**
 * sale表的dao接口
 *
 * @author 汶泽
 * @date 2021/7/25-13:33
 */
public interface SaleDAO {
    /**
     * 添加销售记录
     * @param sale
     * @return 成功的条数
     */
    int insertSale(Sale sale);
}
