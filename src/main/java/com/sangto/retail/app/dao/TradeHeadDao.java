package com.sangto.retail.app.dao;

import com.sangto.retail.app.domain.TradeHead;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TradeHead)表数据库访问层
 *
 * @author bww
 * @since 2020-07-14 11:15:38
 */
@Mapper
public interface TradeHeadDao {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param shopNo, workDay, tradeNo 主键
     */
    TradeHead queryById(@Param("shopNo") String shopNo, @Param("workDay") String workDay, @Param("tradeNo") String tradeNo);


    /**
     * 查询指定行数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    List<TradeHead> queryAllByLimit(@Param("startPosition") int startPosition, @Param("maxResult") int maxResult);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tradeHead 实例对象
     * @return 对象列表
     */
    List<TradeHead> queryAll(TradeHead tradeHead);

    /**
     * 新增数据
     *
     * @param tradeHead 实例对象
     * @return 影响行数
     */
    int insert(TradeHead tradeHead);

    /**
     * 修改数据
     *
     * @param tradeHead 实例对象
     * @return 影响行数
     */
    int update(TradeHead tradeHead);

    /**
     * 通过主键删除数据
     * 通过ID查询单条数据
     *
     * @return 影响行数
     * @Param shopNo, workDay, tradeNo 主键
     */
    int deleteById(@Param("shopNo") String shopNo, @Param("workDay") String workDay, @Param("tradeNo") String tradeNo);

}