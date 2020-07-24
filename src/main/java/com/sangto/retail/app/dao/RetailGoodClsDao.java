package com.sangto.retail.app.dao;

import com.sangto.retail.app.domain.RetailGoodCls;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (RetailGoodCls)表数据库访问层
 *
 * @author bww
 * @since 2020-07-14 11:10:27
 */
@Mapper
public interface RetailGoodClsDao {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param clsId 主键
     */
    RetailGoodCls queryById(@Param("clsId") Integer clsId);


    /**
     * 查询指定行数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    List<RetailGoodCls> queryAllByLimit(@Param("startPosition") int startPosition, @Param("maxResult") int maxResult);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param retailGoodCls 实例对象
     * @return 对象列表
     */
    List<RetailGoodCls> queryAll(RetailGoodCls retailGoodCls);

    /**
     * 新增数据
     *
     * @param retailGoodCls 实例对象
     * @return 影响行数
     */
    int insert(RetailGoodCls retailGoodCls);

    /**
     * 修改数据
     *
     * @param retailGoodCls 实例对象
     * @return 影响行数
     */
    int update(RetailGoodCls retailGoodCls);

    /**
     * 通过主键删除数据
     * 通过ID查询单条数据
     *
     * @return 影响行数
     * @Param clsId 主键
     */
    int deleteById(@Param("clsId") Integer clsId);

}