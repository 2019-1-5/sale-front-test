package com.sangto.retail.app.controller;

import com.sangto.retail.app.domain.PromotionSendBalanceDay;
import com.sangto.retail.app.service.PromotionSendBalanceDayService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (PromotionSendBalanceDay)表控制层
 *
 * @author bww
 * @since 2020-07-14 11:06:36
 */
@Api(tags = "2131231")
@RestController
@RequestMapping("/promotionSendBalanceDay/")
public class PromotionSendBalanceDayController {
    /**
     * 服务对象
     */
    @Resource
    private PromotionSendBalanceDayService promotionSendBalanceDayService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     * @Param storeId, tradeDate, account, batchno, standardNo 主键
     */
    @GetMapping("selectOne")
    public PromotionSendBalanceDay selectOne(@RequestParam("storeId") String storeId, @RequestParam("tradeDate") String tradeDate, @RequestParam("account") String account, @RequestParam("batchno") String batchno, @RequestParam("standardNo") String standardNo) {
        return promotionSendBalanceDayService.queryById(storeId, tradeDate, account, batchno, standardNo);
    }

}