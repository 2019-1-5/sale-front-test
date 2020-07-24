package com.sangto.retail.app.service.impl;

import com.sangto.retail.app.dao.PromotionSalePayDao;
import com.sangto.retail.app.domain.PromotionSalePay;
import com.sangto.retail.app.service.PromotionSalePayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PromotionSalePay)表服务实现类
 *
 * @author bww
 * @since 2020-07-14 11:06:34
 */
@Service
public class PromotionSalePayServiceImpl implements PromotionSalePayService {

    @Resource
    private PromotionSalePayDao promotionSalePayDao;

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param storeId, workDay, saleDay, tradeNo, seqNo 主键
     */
    @Override
    public PromotionSalePay queryById(String storeId, String workDay, String saleDay, String tradeNo, Integer seqNo) {
        return promotionSalePayDao.queryById(storeId, workDay, saleDay, tradeNo, seqNo);
    }

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    @Override
    public List<PromotionSalePay> queryAllByLimit(int startPosition, int maxResult) {
        return promotionSalePayDao.queryAllByLimit(startPosition, maxResult);
    }

    /**
     * 新增数据
     *
     * @param promotionSalePay 实例对象
     * @return 实例对象
     */
    @Override
    public PromotionSalePay insert(PromotionSalePay promotionSalePay) {
        promotionSalePayDao.insert(promotionSalePay);
        return promotionSalePay;
    }

    /**
     * 修改数据
     *
     * @param promotionSalePay 实例对象
     * @return 实例对象
     */
    @Override
    public PromotionSalePay update(PromotionSalePay promotionSalePay) {
        promotionSalePayDao.update(promotionSalePay);
        return queryById(promotionSalePay.getStoreId(), promotionSalePay.getWorkDay(), promotionSalePay.getSaleDay(), promotionSalePay.getTradeNo(), promotionSalePay.getSeqNo());
    }

    /**
     * 通过主键删除数据
     *
     * @param storeId, workDay, saleDay, tradeNo, seqNo 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String storeId, String workDay, String saleDay, String tradeNo, Integer seqNo) {
        return promotionSalePayDao.deleteById(storeId, workDay, saleDay, tradeNo, seqNo) > 0;
    }
}