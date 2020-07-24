package com.sangto.retail.app.service.impl;

import com.sangto.retail.app.dao.PromotionSaleDetailDao;
import com.sangto.retail.app.domain.PromotionSaleDetail;
import com.sangto.retail.app.service.PromotionSaleDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PromotionSaleDetail)表服务实现类
 *
 * @author bww
 * @since 2020-07-14 11:06:25
 */
@Service
public class PromotionSaleDetailServiceImpl implements PromotionSaleDetailService {

    @Resource
    private PromotionSaleDetailDao promotionSaleDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param storeId, workDay, saleDay, tradeNo, seqNo 主键
     */
    @Override
    public PromotionSaleDetail queryById(String storeId, String workDay, String saleDay, String tradeNo, Integer seqNo) {
        return promotionSaleDetailDao.queryById(storeId, workDay, saleDay, tradeNo, seqNo);
    }

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    @Override
    public List<PromotionSaleDetail> queryAllByLimit(int startPosition, int maxResult) {
        return promotionSaleDetailDao.queryAllByLimit(startPosition, maxResult);
    }

    /**
     * 新增数据
     *
     * @param promotionSaleDetail 实例对象
     * @return 实例对象
     */
    @Override
    public PromotionSaleDetail insert(PromotionSaleDetail promotionSaleDetail) {
        promotionSaleDetailDao.insert(promotionSaleDetail);
        return promotionSaleDetail;
    }

    /**
     * 修改数据
     *
     * @param promotionSaleDetail 实例对象
     * @return 实例对象
     */
    @Override
    public PromotionSaleDetail update(PromotionSaleDetail promotionSaleDetail) {
        promotionSaleDetailDao.update(promotionSaleDetail);

        return queryById(promotionSaleDetail.getStoreId(), promotionSaleDetail.getWorkDay(), promotionSaleDetail.getSaleDay(), promotionSaleDetail.getTradeNo(), promotionSaleDetail.getSeqNo());
    }

    /**
     * 通过主键删除数据
     *
     * @param storeId, workDay, saleDay, tradeNo, seqNo 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String storeId, String workDay, String saleDay, String tradeNo, Integer seqNo) {
        return promotionSaleDetailDao.deleteById(storeId, workDay, saleDay, tradeNo, seqNo) > 0;
    }
}