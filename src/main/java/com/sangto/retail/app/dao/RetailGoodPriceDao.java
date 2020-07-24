package com.sangto.retail.app.dao;

import com.sangto.retail.app.domain.RetailGoodPrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (RetailGoodPrice)表数据库访问层
 *
 * @author bww
 * @since 2020-07-14 11:10:28
 */
@Mapper
public interface RetailGoodPriceDao {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param storeId, gdno 主键
     */
    RetailGoodPrice queryById(@Param("storeId") String storeId, @Param("gdno") String gdno);


    /**
     * 查询指定行数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    List<RetailGoodPrice> queryAllByLimit(@Param("startPosition") int startPosition, @Param("maxResult") int maxResult);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param retailGoodPrice 实例对象
     * @return 对象列表
     */
    List<RetailGoodPrice> queryAll(RetailGoodPrice retailGoodPrice);

    /**
     * 新增数据
     *
     * @param retailGoodPrice 实例对象
     * @return 影响行数
     */
    int insert(RetailGoodPrice retailGoodPrice);

    /**
     * 修改数据
     *
     * @param retailGoodPrice 实例对象
     * @return 影响行数
     */
    int update(RetailGoodPrice retailGoodPrice);

    /**
     * 通过主键删除数据
     * 通过ID查询单条数据
     *
     * @return 影响行数
     * @Param storeId, gdno 主键
     */
    int deleteById(@Param("storeId") String storeId, @Param("gdno") String gdno);

}