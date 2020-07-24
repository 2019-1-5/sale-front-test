package com.sangto.retail.app.service.impl;

import com.sangto.retail.app.dao.RetailGoodPriceChgHeadDao;
import com.sangto.retail.app.domain.RetailGoodPriceChgHead;
import com.sangto.retail.app.service.RetailGoodPriceChgHeadService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RetailGoodPriceChgHead)表服务实现类
 *
 * @author bww
 * @since 2020-07-14 11:10:30
 */
@Service
public class RetailGoodPriceChgHeadServiceImpl implements RetailGoodPriceChgHeadService {

    @Resource
    private RetailGoodPriceChgHeadDao retailGoodPriceChgHeadDao;

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param chgno 主键
     */
    @Override
    public RetailGoodPriceChgHead queryById(String chgno) {
        return retailGoodPriceChgHeadDao.queryById(chgno);
    }

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    @Override
    public List<RetailGoodPriceChgHead> queryAllByLimit(int startPosition, int maxResult) {
        return retailGoodPriceChgHeadDao.queryAllByLimit(startPosition, maxResult);
    }

    /**
     * 新增数据
     *
     * @param retailGoodPriceChgHead 实例对象
     * @return 实例对象
     */
    @Override
    public RetailGoodPriceChgHead insert(RetailGoodPriceChgHead retailGoodPriceChgHead) {
        retailGoodPriceChgHeadDao.insert(retailGoodPriceChgHead);
        return retailGoodPriceChgHead;
    }

    /**
     * 修改数据
     *
     * @param retailGoodPriceChgHead 实例对象
     * @return 实例对象
     */
    @Override
    public RetailGoodPriceChgHead update(RetailGoodPriceChgHead retailGoodPriceChgHead) {
        retailGoodPriceChgHeadDao.update(retailGoodPriceChgHead);
        return queryById(retailGoodPriceChgHead.getChgno());
    }

    /**
     * 通过主键删除数据
     *
     * @param chgno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String chgno) {
        return retailGoodPriceChgHeadDao.deleteById(chgno) > 0;
    }
}