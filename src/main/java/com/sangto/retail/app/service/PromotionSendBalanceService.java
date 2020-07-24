package com.sangto.retail.app.service;

import com.sangto.retail.app.domain.PromotionSendBalance;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (PromotionSendBalance)表服务接口
 *
 * @author bww
 * @since 2020-07-14 11:06:35
 */
public interface PromotionSendBalanceService {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param storeId, account, batchno, standardNo 主键
     */
    PromotionSendBalance queryById(@Param("storeId") String storeId, @Param("account") String account, @Param("batchno") String batchno, @Param("standardNo") String standardNo);

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    List<PromotionSendBalance> queryAllByLimit(int startPosition, int maxResult);

    /**
     * 新增数据
     *
     * @param promotionSendBalance 实例对象
     * @return 实例对象
     */
    PromotionSendBalance insert(PromotionSendBalance promotionSendBalance);

    /**
     * 修改数据
     *
     * @param promotionSendBalance 实例对象
     * @return 实例对象
     */
    PromotionSendBalance update(PromotionSendBalance promotionSendBalance);

    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     * @Param storeId, account, batchno, standardNo 主键
     */
    boolean deleteById(@Param("storeId") String storeId, @Param("account") String account, @Param("batchno") String batchno, @Param("standardNo") String standardNo);

}