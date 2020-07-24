package com.sangto.retail.app.service.impl;

import com.sangto.retail.app.dao.PromotionStandardDao;
import com.sangto.retail.app.domain.PromotionStandard;
import com.sangto.retail.app.service.PromotionStandardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PromotionStandard)表服务实现类
 *
 * @author bww
 * @since 2020-07-14 11:06:37
 */
@Service
public class PromotionStandardServiceImpl implements PromotionStandardService {

    @Resource
    private PromotionStandardDao promotionStandardDao;

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     * @Param standardNo 主键
     */
    @Override
    public PromotionStandard queryById(String standardNo) {
        return promotionStandardDao.queryById(standardNo);
    }

    /**
     * 查询多条数据
     *
     * @param startPosition 查询起始位置
     * @param maxResult     查询条数
     * @return 对象列表
     */
    @Override
    public List<PromotionStandard> queryAllByLimit(int startPosition, int maxResult) {
        return promotionStandardDao.queryAllByLimit(startPosition, maxResult);
    }

    /**
     * 新增数据
     *
     * @param promotionStandard 实例对象
     * @return 实例对象
     */
    @Override
    public PromotionStandard insert(PromotionStandard promotionStandard) {
        promotionStandardDao.insert(promotionStandard);
        return promotionStandard;
    }

    /**
     * 修改数据
     *
     * @param promotionStandard 实例对象
     * @return 实例对象
     */
    @Override
    public PromotionStandard update(PromotionStandard promotionStandard) {
        promotionStandardDao.update(promotionStandard);
        return queryById(promotionStandard.getStandardNo());
    }

    /**
     * 通过主键删除数据
     *
     * @param standardNo 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String standardNo) {
        return promotionStandardDao.deleteById(standardNo) > 0;
    }
}