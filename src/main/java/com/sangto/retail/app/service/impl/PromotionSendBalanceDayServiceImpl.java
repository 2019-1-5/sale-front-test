package com.sangto.retail.app.service.impl;

import com.sangto.retail.app.dao.PromotionSendBalanceDayDao;
import com.sangto.retail.app.domain.PromotionSendBalanceDay;
import com.sangto.retail.app.service.PromotionSendBalanceDayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PromotionSendBalanceDay)表服务实现类
 *
 * @author bww
 * @since 2020-07-14 11:06:36
 */
@Service
public class PromotionSendBalanceDayServiceImpl implements PromotionSendBalanceDayService {

    @Resource
    private PromotionSendBalanceDayDao promotionSendBalanceDayDao;

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param storeId, tradeDate, account, batchno, standardNo 主键
     */
    @Override
    public PromotionSendBalanceDay queryById(String storeId, String tradeDate, String account, String batchno, String standardNo) {
        return promotionSendBalanceDayDao.queryById(storeId, tradeDate, account, batchno, standardNo);
    }

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    @Override
    public List<PromotionSendBalanceDay> queryAllByLimit(int startPosition, int maxResult) {
        return promotionSendBalanceDayDao.queryAllByLimit(startPosition, maxResult);
    }

    /**
     * 新增数据
     *
     * @param promotionSendBalanceDay 实例对象
     * @return 实例对象
     */
    @Override
    public PromotionSendBalanceDay insert(PromotionSendBalanceDay promotionSendBalanceDay) {
        promotionSendBalanceDayDao.insert(promotionSendBalanceDay);
        return promotionSendBalanceDay;
    }

    /**
     * 修改数据
     *
     * @param promotionSendBalanceDay 实例对象
     * @return 实例对象
     */
    @Override
    public PromotionSendBalanceDay update(PromotionSendBalanceDay promotionSendBalanceDay) {
        promotionSendBalanceDayDao.update(promotionSendBalanceDay);
        return queryById(promotionSendBalanceDay.getStoreId(), promotionSendBalanceDay.getTradeDate(), promotionSendBalanceDay.getAccount(), promotionSendBalanceDay.getBatchno(), promotionSendBalanceDay.getStandardNo());
    }

    /**
     * 通过主键删除数据
     *
     * @param storeId, tradeDate, account, batchno, standardNo 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String storeId, String tradeDate, String account, String batchno, String standardNo) {
        return promotionSendBalanceDayDao.deleteById(storeId, tradeDate, account, batchno, standardNo) > 0;
    }
}