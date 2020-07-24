package com.sangto.retail.app.dao;

import com.sangto.retail.app.domain.PromotionSendBalanceDay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (PromotionSendBalanceDay)表数据库访问层
 *
 * @author bww
 * @since 2020-07-14 11:06:35
 */
@Mapper
public interface PromotionSendBalanceDayDao {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param storeId, tradeDate, account, batchno, standardNo 主键
     */
    PromotionSendBalanceDay queryById(@Param("storeId") String storeId, @Param("tradeDate") String tradeDate, @Param("account") String account, @Param("batchno") String batchno, @Param("standardNo") String standardNo);


    /**
     * 查询指定行数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    List<PromotionSendBalanceDay> queryAllByLimit(@Param("startPosition") int startPosition, @Param("maxResult") int maxResult);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param promotionSendBalanceDay 实例对象
     * @return 对象列表
     */
    List<PromotionSendBalanceDay> queryAll(PromotionSendBalanceDay promotionSendBalanceDay);

    /**
     * 新增数据
     *
     * @param promotionSendBalanceDay 实例对象
     * @return 影响行数
     */
    int insert(PromotionSendBalanceDay promotionSendBalanceDay);

    /**
     * 修改数据
     *
     * @param promotionSendBalanceDay 实例对象
     * @return 影响行数
     */
    int update(PromotionSendBalanceDay promotionSendBalanceDay);

    /**
     * 通过主键删除数据
     * 通过ID查询单条数据
     *
     * @return 影响行数
     * @Param storeId, tradeDate, account, batchno, standardNo 主键
     */
    int deleteById(@Param("storeId") String storeId, @Param("tradeDate") String tradeDate, @Param("account") String account, @Param("batchno") String batchno, @Param("standardNo") String standardNo);

}