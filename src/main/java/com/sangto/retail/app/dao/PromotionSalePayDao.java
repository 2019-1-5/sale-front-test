package com.sangto.retail.app.dao;

import com.sangto.retail.app.domain.PromotionSalePay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (PromotionSalePay)表数据库访问层
 *
 * @author bww
 * @since 2020-07-14 11:06:33
 */
@Mapper
public interface PromotionSalePayDao {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param storeId, workDay, saleDay, tradeNo, seqNo 主键
     */
    PromotionSalePay queryById(@Param("storeId") String storeId, @Param("workDay") String workDay, @Param("saleDay") String saleDay, @Param("tradeNo") String tradeNo, @Param("seqNo") Integer seqNo);


    /**
     * 查询指定行数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    List<PromotionSalePay> queryAllByLimit(@Param("startPosition") int startPosition, @Param("maxResult") int maxResult);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param promotionSalePay 实例对象
     * @return 对象列表
     */
    List<PromotionSalePay> queryAll(PromotionSalePay promotionSalePay);

    /**
     * 新增数据
     *
     * @param promotionSalePay 实例对象
     * @return 影响行数
     */
    int insert(PromotionSalePay promotionSalePay);

    /**
     * 修改数据
     *
     * @param promotionSalePay 实例对象
     * @return 影响行数
     */
    int update(PromotionSalePay promotionSalePay);

    /**
     * 通过主键删除数据
     * 通过ID查询单条数据
     *
     * @return 影响行数
     * @Param storeId, workDay, saleDay, tradeNo, seqNo 主键
     */
    int deleteById(@Param("storeId") String storeId, @Param("workDay") String workDay, @Param("saleDay") String saleDay, @Param("tradeNo") String tradeNo, @Param("seqNo") Integer seqNo);

}