package com.sangto.retail.app.service;

import com.sangto.retail.app.domain.RetailGoodPriceChgDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (RetailGoodPriceChgDetail)表服务接口
 *
 * @author bww
 * @since 2020-07-14 11:10:29
 */
public interface RetailGoodPriceChgDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param chgno, seq 主键
     */
    RetailGoodPriceChgDetail queryById(@Param("chgno") String chgno, @Param("seq") Integer seq);

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    List<RetailGoodPriceChgDetail> queryAllByLimit(int startPosition, int maxResult);

    /**
     * 新增数据
     *
     * @param retailGoodPriceChgDetail 实例对象
     * @return 实例对象
     */
    RetailGoodPriceChgDetail insert(RetailGoodPriceChgDetail retailGoodPriceChgDetail);

    /**
     * 修改数据
     *
     * @param retailGoodPriceChgDetail 实例对象
     * @return 实例对象
     */
    RetailGoodPriceChgDetail update(RetailGoodPriceChgDetail retailGoodPriceChgDetail);

    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     * @Param chgno, seq 主键
     */
    boolean deleteById(@Param("chgno") String chgno, @Param("seq") Integer seq);

}