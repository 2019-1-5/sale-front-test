package com.sangto.retail.app.service;

import com.sangto.retail.app.domain.TradeHead;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TradeHead)表服务接口
 *
 * @author bww
 * @since 2020-07-14 11:15:38
 */
public interface TradeHeadService {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param shopNo, workDay, tradeNo 主键
     */
    TradeHead queryById(@Param("shopNo") String shopNo, @Param("workDay") String workDay, @Param("tradeNo") String tradeNo);

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    List<TradeHead> queryAllByLimit(int startPosition, int maxResult);

    /**
     * 新增数据
     *
     * @param tradeHead 实例对象
     * @return 实例对象
     */
    TradeHead insert(TradeHead tradeHead);

    /**
     * 修改数据
     *
     * @param tradeHead 实例对象
     * @return 实例对象
     */
    TradeHead update(TradeHead tradeHead);

    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     * @Param shopNo, workDay, tradeNo 主键
     */
    boolean deleteById(@Param("shopNo") String shopNo, @Param("workDay") String workDay, @Param("tradeNo") String tradeNo);

}