package com.sangto.retail.app.service.impl;

import com.sangto.retail.app.dao.PromotionSendBalanceDao;
import com.sangto.retail.app.domain.PromotionSendBalance;
import com.sangto.retail.app.service.PromotionSendBalanceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PromotionSendBalance)表服务实现类
 *
 * @author bww
 * @since 2020-07-14 11:06:35
 */
@Service
public class PromotionSendBalanceServiceImpl implements PromotionSendBalanceService {

    @Resource
    private PromotionSendBalanceDao promotionSendBalanceDao;

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param storeId, account, batchno, standardNo 主键
     */
    @Override
    public PromotionSendBalance queryById(String storeId, String account, String batchno, String standardNo) {
        return promotionSendBalanceDao.queryById(storeId, account, batchno, standardNo);
    }

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    @Override
    public List<PromotionSendBalance> queryAllByLimit(int startPosition, int maxResult) {
        return promotionSendBalanceDao.queryAllByLimit(startPosition, maxResult);
    }

    /**
     * 新增数据
     *
     * @param promotionSendBalance 实例对象
     * @return 实例对象
     */
    @Override
    public PromotionSendBalance insert(PromotionSendBalance promotionSendBalance) {
        promotionSendBalanceDao.insert(promotionSendBalance);
        return promotionSendBalance;
    }

    /**
     * 修改数据
     *
     * @param promotionSendBalance 实例对象
     * @return 实例对象
     */
    @Override
    public PromotionSendBalance update(PromotionSendBalance promotionSendBalance) {
        promotionSendBalanceDao.update(promotionSendBalance);
        return queryById(promotionSendBalance.getStoreId(), promotionSendBalance.getAccount(), promotionSendBalance.getBatchno(), promotionSendBalance.getStandardNo());
    }

    /**
     * 通过主键删除数据
     *
     * @param storeId, account, batchno, standardNo 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String storeId, String account, String batchno, String standardNo) {
        return promotionSendBalanceDao.deleteById(storeId, account, batchno, standardNo) > 0;
    }
}