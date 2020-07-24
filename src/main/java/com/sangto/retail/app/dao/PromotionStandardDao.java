package com.sangto.retail.app.dao;

import com.sangto.retail.app.domain.PromotionStandard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (PromotionStandard)表数据库访问层
 *
 * @author bww
 * @since 2020-07-14 11:06:36
 */
@Mapper
public interface PromotionStandardDao {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param standardNo 主键
     */
    PromotionStandard queryById(@Param("standardNo") String standardNo);


    /**
     * 查询指定行数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    List<PromotionStandard> queryAllByLimit(@Param("startPosition") int startPosition, @Param("maxResult") int maxResult);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param promotionStandard 实例对象
     * @return 对象列表
     */
    List<PromotionStandard> queryAll(PromotionStandard promotionStandard);

    /**
     * 新增数据
     *
     * @param promotionStandard 实例对象
     * @return 影响行数
     */
    int insert(PromotionStandard promotionStandard);

    /**
     * 修改数据
     *
     * @param promotionStandard 实例对象
     * @return 影响行数
     */
    int update(PromotionStandard promotionStandard);

    /**
     * 通过主键删除数据
     * 通过ID查询单条数据
     *
     * @return 影响行数
     * @Param standardNo 主键
     */
    int deleteById(@Param("standardNo") String standardNo);

}