package com.sangto.retail.app.service;

import com.sangto.retail.app.domain.RetailGoodPriceChgHead;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (RetailGoodPriceChgHead)表服务接口
 *
 * @author bww
 * @since 2020-07-14 11:10:30
 */
public interface RetailGoodPriceChgHeadService {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param chgno 主键
     */
    RetailGoodPriceChgHead queryById(@Param("chgno") String chgno);

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    List<RetailGoodPriceChgHead> queryAllByLimit(int startPosition, int maxResult);

    /**
     * 新增数据
     *
     * @param retailGoodPriceChgHead 实例对象
     * @return 实例对象
     */
    RetailGoodPriceChgHead insert(RetailGoodPriceChgHead retailGoodPriceChgHead);

    /**
     * 修改数据
     *
     * @param retailGoodPriceChgHead 实例对象
     * @return 实例对象
     */
    RetailGoodPriceChgHead update(RetailGoodPriceChgHead retailGoodPriceChgHead);

    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     * @Param chgno 主键
     */
    boolean deleteById(@Param("chgno") String chgno);

}