package com.sangto.retail.app.service.impl;

import com.sangto.retail.app.dao.TradeHeadDao;
import com.sangto.retail.app.domain.TradeHead;
import com.sangto.retail.app.service.TradeHeadService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TradeHead)表服务实现类
 *
 * @author bww
 * @since 2020-07-14 11:15:38
 */
@Service
public class TradeHeadServiceImpl implements TradeHeadService {

    @Resource
    private TradeHeadDao tradeHeadDao;

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param shopNo, workDay, tradeNo 主键
     */
    @Override
    @Transactional
    public TradeHead queryById(String shopNo, String workDay, String tradeNo) {
        return tradeHeadDao.queryById(shopNo, workDay, tradeNo);
    }

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    @Override
    public List<TradeHead> queryAllByLimit(int startPosition, int maxResult) {
        return tradeHeadDao.queryAllByLimit(startPosition, maxResult);
    }

    /**
     * 新增数据
     *
     * @param tradeHead 实例对象
     * @return 实例对象
     */
    @Override
    public TradeHead insert(TradeHead tradeHead) {
        tradeHeadDao.insert(tradeHead);
        return tradeHead;
    }

    /**
     * 修改数据
     *
     * @param tradeHead 实例对象
     * @return 实例对象
     */
    @Override
    public TradeHead update(TradeHead tradeHead) {
        tradeHeadDao.update(tradeHead);
        return queryById(tradeHead.getShopNo(), tradeHead.getWorkDay(), tradeHead.getTradeNo());
    }

    /**
     * 通过主键删除数据
     *
     * @param shopNo, workDay, tradeNo 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String shopNo, String workDay, String tradeNo) {
        return tradeHeadDao.deleteById(shopNo, workDay, tradeNo) > 0;
    }
}