package com.sangto.retail.app.controller;

import com.sangto.retail.app.domain.PromotionSalePay;
import com.sangto.retail.app.service.PromotionSalePayService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (PromotionSalePay)表控制层
 *
 * @author bww
 * @since 2020-07-14 11:06:34
 */
@Api(tags = "")
@RestController
@RequestMapping("/promotionSalePay/")
public class PromotionSalePayController {
    /**
     * 服务对象
     */
    @Resource
    private PromotionSalePayService promotionSalePayService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     * @Param storeId, workDay, saleDay, tradeNo, seqNo 主键
     */
    @GetMapping("selectOne")
    public PromotionSalePay selectOne(@RequestParam("storeId") String storeId, @RequestParam("workDay") String workDay, @RequestParam("saleDay") String saleDay, @RequestParam("tradeNo") String tradeNo, @RequestParam("seqNo") Integer seqNo) {
        return promotionSalePayService.queryById(storeId, workDay, saleDay, tradeNo, seqNo);
    }

}