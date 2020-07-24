package com.sangto.retail.app.service;

import com.sangto.retail.app.domain.RetailGoodCls;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (RetailGoodCls)表服务接口
 *
 * @author bww
 * @since 2020-07-14 11:10:27
 */
public interface RetailGoodClsService {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param clsId 主键
     */
    RetailGoodCls queryById(@Param("clsId") Integer clsId);

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    List<RetailGoodCls> queryAllByLimit(int startPosition, int maxResult);

    /**
     * 新增数据
     *
     * @param retailGoodCls 实例对象
     * @return 实例对象
     */
    RetailGoodCls insert(RetailGoodCls retailGoodCls);

    /**
     * 修改数据
     *
     * @param retailGoodCls 实例对象
     * @return 实例对象
     */
    RetailGoodCls update(RetailGoodCls retailGoodCls);

    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     * @Param clsId 主键
     */
    boolean deleteById(@Param("clsId") Integer clsId);

}