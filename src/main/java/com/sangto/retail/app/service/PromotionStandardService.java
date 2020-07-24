package com.sangto.retail.app.service;

import com.sangto.retail.app.domain.PromotionStandard;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (PromotionStandard)表服务接口
 *
 * @author bww
 * @since 2020-07-14 11:06:37
 */
public interface PromotionStandardService {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param standardNo 主键
     */
    PromotionStandard queryById(@Param("standardNo") String standardNo);

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    List<PromotionStandard> queryAllByLimit(int startPosition, int maxResult);

    /**
     * 新增数据
     *
     * @param promotionStandard 实例对象
     * @return 实例对象
     */
    PromotionStandard insert(PromotionStandard promotionStandard);

    /**
     * 修改数据
     *
     * @param promotionStandard 实例对象
     * @return 实例对象
     */
    PromotionStandard update(PromotionStandard promotionStandard);

    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     * @Param standardNo 主键
     */
    boolean deleteById(@Param("standardNo") String standardNo);

}