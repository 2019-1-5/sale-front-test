package com.sangto.retail.app.service.impl;

import com.sangto.retail.app.dao.RetailGoodPriceDao;
import com.sangto.retail.app.domain.RetailGoodPrice;
import com.sangto.retail.app.service.RetailGoodPriceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RetailGoodPrice)表服务实现类
 *
 * @author bww
 * @since 2020-07-14 11:10:28
 */
@Service
public class RetailGoodPriceServiceImpl implements RetailGoodPriceService {

    @Resource
    private RetailGoodPriceDao retailGoodPriceDao;

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param storeId, gdno 主键
     */
    @Override
    public RetailGoodPrice queryById(String storeId, String gdno) {
        return retailGoodPriceDao.queryById(storeId, gdno);
    }

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    @Override
    public List<RetailGoodPrice> queryAllByLimit(int startPosition, int maxResult) {
        return retailGoodPriceDao.queryAllByLimit(startPosition, maxResult);
    }

    /**
     * 新增数据
     *
     * @param retailGoodPrice 实例对象
     * @return 实例对象
     */
    @Override
    public RetailGoodPrice insert(RetailGoodPrice retailGoodPrice) {
        retailGoodPriceDao.insert(retailGoodPrice);
        return retailGoodPrice;
    }

    /**
     * 修改数据
     *
     * @param retailGoodPrice 实例对象
     * @return 实例对象
     */
    @Override
    public RetailGoodPrice update(RetailGoodPrice retailGoodPrice) {
        retailGoodPriceDao.update(retailGoodPrice);
        return queryById(retailGoodPrice.getStoreId(), retailGoodPrice.getGdno());
    }

    /**
     * 通过主键删除数据
     *
     * @param storeId, gdno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String storeId, String gdno) {
        return retailGoodPriceDao.deleteById(storeId, gdno) > 0;
    }
}