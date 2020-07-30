package com.sangto.retail.app.controller;

import com.sangto.retail.app.service.PromotionSaleDetailService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.mateng.framework.common.response.CallBack;
import pers.mateng.framework.common.response.Response;

import javax.annotation.Resource;

/**
 * (PromotionSaleDetail)表控制层
 *
 * @author bww
 * @since 2020-07-14 11:06:26
 */
@Api(tags = "")
@RestController
@RequestMapping("/promotionSaleDetail/")
public class PromotionSaleDetailController {
    /**
     * 服务对象
     */
    @Resource
    private PromotionSaleDetailService promotionSaleDetailService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     * @Param storeId, workDay, saleDay, tradeNo, seqNo 主键
     */
    @GetMapping("selectOne")
    public Response selectOne(@RequestParam("storeId") final String storeId, @RequestParam("workDay") final String workDay, @RequestParam("saleDay") final String saleDay, @RequestParam("tradeNo") final String tradeNo, @RequestParam("seqNo") final Integer seqNo) {
        return new CallBack() {
            @Override
            protected Object run() {
                return promotionSaleDetailService.queryById(storeId, workDay, saleDay, tradeNo, seqNo);
            }
        }.execute();
    }

}