package com.sangto.retail.app.service.impl;

import com.sangto.retail.app.dao.RetailGoodPriceChgDetailDao;
import com.sangto.retail.app.domain.RetailGoodPriceChgDetail;
import com.sangto.retail.app.service.RetailGoodPriceChgDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RetailGoodPriceChgDetail)表服务实现类
 *
 * @author bww
 * @since 2020-07-14 11:10:29
 */
@Service
public class RetailGoodPriceChgDetailServiceImpl implements RetailGoodPriceChgDetailService {

    @Resource
    private RetailGoodPriceChgDetailDao retailGoodPriceChgDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param chgno, seq 主键
     */
    @Override
    public RetailGoodPriceChgDetail queryById(String chgno, Integer seq) {
        return retailGoodPriceChgDetailDao.queryById(chgno, seq);
    }

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    @Override
    public List<RetailGoodPriceChgDetail> queryAllByLimit(int startPosition, int maxResult) {
        return retailGoodPriceChgDetailDao.queryAllByLimit(startPosition, maxResult);
    }

    /**
     * 新增数据
     *
     * @param retailGoodPriceChgDetail 实例对象
     * @return 实例对象
     */
    @Override
    public RetailGoodPriceChgDetail insert(RetailGoodPriceChgDetail retailGoodPriceChgDetail) {
        retailGoodPriceChgDetailDao.insert(retailGoodPriceChgDetail);
        return retailGoodPriceChgDetail;
    }

    /**
     * 修改数据
     *
     * @param retailGoodPriceChgDetail 实例对象
     * @return 实例对象
     */
    @Override
    public RetailGoodPriceChgDetail update(RetailGoodPriceChgDetail retailGoodPriceChgDetail) {
        retailGoodPriceChgDetailDao.update(retailGoodPriceChgDetail);
        return queryById(retailGoodPriceChgDetail.getChgno(), retailGoodPriceChgDetail.getSeq());
    }

    /**
     * 通过主键删除数据
     *
     * @param chgno, seq 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String chgno, Integer seq) {
        return retailGoodPriceChgDetailDao.deleteById(chgno, seq) > 0;
    }
}