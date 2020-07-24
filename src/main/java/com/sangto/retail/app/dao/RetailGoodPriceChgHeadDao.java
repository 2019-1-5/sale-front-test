package com.sangto.retail.app.dao;

import com.sangto.retail.app.domain.RetailGoodPriceChgHead;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (RetailGoodPriceChgHead)表数据库访问层
 *
 * @author bww
 * @since 2020-07-14 11:10:30
 */
@Mapper
public interface RetailGoodPriceChgHeadDao {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param chgno 主键
     */
    RetailGoodPriceChgHead queryById(@Param("chgno") String chgno);


    /**
     * 查询指定行数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    List<RetailGoodPriceChgHead> queryAllByLimit(@Param("startPosition") int startPosition, @Param("maxResult") int maxResult);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param retailGoodPriceChgHead 实例对象
     * @return 对象列表
     */
    List<RetailGoodPriceChgHead> queryAll(RetailGoodPriceChgHead retailGoodPriceChgHead);

    /**
     * 新增数据
     *
     * @param retailGoodPriceChgHead 实例对象
     * @return 影响行数
     */
    int insert(RetailGoodPriceChgHead retailGoodPriceChgHead);

    /**
     * 修改数据
     *
     * @param retailGoodPriceChgHead 实例对象
     * @return 影响行数
     */
    int update(RetailGoodPriceChgHead retailGoodPriceChgHead);

    /**
     * 通过主键删除数据
     * 通过ID查询单条数据
     *
     * @return 影响行数
     * @Param chgno 主键
     */
    int deleteById(@Param("chgno") String chgno);

}