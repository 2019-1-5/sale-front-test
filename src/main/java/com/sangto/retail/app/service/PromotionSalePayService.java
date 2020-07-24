package com.sangto.retail.app.service;

import com.sangto.retail.app.domain.PromotionSalePay;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (PromotionSalePay)表服务接口
 *
 * @author bww
 * @since 2020-07-14 11:06:33
 */
public interface PromotionSalePayService {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param storeId, workDay, saleDay, tradeNo, seqNo 主键
     */
    PromotionSalePay queryById(@Param("storeId") String storeId, @Param("workDay") String workDay, @Param("saleDay") String saleDay, @Param("tradeNo") String tradeNo, @Param("seqNo") Integer seqNo);

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    List<PromotionSalePay> queryAllByLimit(int startPosition, int maxResult);

    /**
     * 新增数据
     *
     * @param promotionSalePay 实例对象
     * @return 实例对象
     */
    PromotionSalePay insert(PromotionSalePay promotionSalePay);

    /**
     * 修改数据
     *
     * @param promotionSalePay 实例对象
     * @return 实例对象
     */
    PromotionSalePay update(PromotionSalePay promotionSalePay);

    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     * @Param storeId, workDay, saleDay, tradeNo, seqNo 主键
     */
    boolean deleteById(@Param("storeId") String storeId, @Param("workDay") String workDay, @Param("saleDay") String saleDay, @Param("tradeNo") String tradeNo, @Param("seqNo") Integer seqNo);

}