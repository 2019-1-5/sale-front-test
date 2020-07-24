package com.sangto.retail.app.dao;

import com.sangto.retail.app.domain.PromotionSendBalance;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (PromotionSendBalance)表数据库访问层
 *
 * @author bww
 * @since 2020-07-14 11:06:34
 */
@Mapper
public interface PromotionSendBalanceDao {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param storeId, account, batchno, standardNo 主键
     */
    PromotionSendBalance queryById(@Param("storeId") String storeId, @Param("account") String account, @Param("batchno") String batchno, @Param("standardNo") String standardNo);


    /**
     * 查询指定行数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    List<PromotionSendBalance> queryAllByLimit(@Param("startPosition") int startPosition, @Param("maxResult") int maxResult);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param promotionSendBalance 实例对象
     * @return 对象列表
     */
    List<PromotionSendBalance> queryAll(PromotionSendBalance promotionSendBalance);

    /**
     * 新增数据
     *
     * @param promotionSendBalance 实例对象
     * @return 影响行数
     */
    int insert(PromotionSendBalance promotionSendBalance);

    /**
     * 修改数据
     *
     * @param promotionSendBalance 实例对象
     * @return 影响行数
     */
    int update(PromotionSendBalance promotionSendBalance);

    /**
     * 通过主键删除数据
     * 通过ID查询单条数据
     *
     * @return 影响行数
     * @Param storeId, account, batchno, standardNo 主键
     */
    int deleteById(@Param("storeId") String storeId, @Param("account") String account, @Param("batchno") String batchno, @Param("standardNo") String standardNo);

}