package com.sangto.retail.app.service.impl;

import com.sangto.retail.app.dao.RetailGoodClsDao;
import com.sangto.retail.app.domain.RetailGoodCls;
import com.sangto.retail.app.service.RetailGoodClsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RetailGoodCls)表服务实现类
 *
 * @author bww
 * @since 2020-07-14 11:10:27
 */
@Service
public class RetailGoodClsServiceImpl implements RetailGoodClsService {

    @Resource
    private RetailGoodClsDao retailGoodClsDao;

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param clsId 主键
     */
    @Override
    public RetailGoodCls queryById(Integer clsId) {
        return retailGoodClsDao.queryById(clsId);
    }

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    @Override
    public List<RetailGoodCls> queryAllByLimit(int startPosition, int maxResult) {
        return retailGoodClsDao.queryAllByLimit(startPosition, maxResult);
    }

    /**
     * 新增数据
     *
     * @param retailGoodCls 实例对象
     * @return 实例对象
     */
    @Override
    public RetailGoodCls insert(RetailGoodCls retailGoodCls) {
        retailGoodClsDao.insert(retailGoodCls);
        return retailGoodCls;
    }

    /**
     * 修改数据
     *
     * @param retailGoodCls 实例对象
     * @return 实例对象
     */
    @Override
    public RetailGoodCls update(RetailGoodCls retailGoodCls) {
        retailGoodClsDao.update(retailGoodCls);
        return queryById(retailGoodCls.getClsId());
    }

    /**
     * 通过主键删除数据
     *
     * @param clsId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer clsId) {
        return retailGoodClsDao.deleteById(clsId) > 0;
    }
}