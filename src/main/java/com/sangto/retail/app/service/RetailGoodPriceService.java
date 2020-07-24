package com.sangto.retail.app.service;

import com.sangto.retail.app.domain.RetailGoodPrice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (RetailGoodPrice)表服务接口
 *
 * @author bww
 * @since 2020-07-14 11:10:28
 */
public interface RetailGoodPriceService {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param storeId, gdno 主键
     */
    RetailGoodPrice queryById(@Param("storeId") String storeId, @Param("gdno") String gdno);

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    List<RetailGoodPrice> queryAllByLimit(int startPosition, int maxResult);

    /**
     * 新增数据
     *
     * @param retailGoodPrice 实例对象
     * @return 实例对象
     */
    RetailGoodPrice insert(RetailGoodPrice retailGoodPrice);

    /**
     * 修改数据
     *
     * @param retailGoodPrice 实例对象
     * @return 实例对象
     */
    RetailGoodPrice update(RetailGoodPrice retailGoodPrice);

    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     * @Param storeId, gdno 主键
     */
    boolean deleteById(@Param("storeId") String storeId, @Param("gdno") String gdno);

}