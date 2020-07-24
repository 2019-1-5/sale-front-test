package com.sangto.retail.app.controller;

import com.sangto.retail.app.domain.PromotionSendBalance;
import com.sangto.retail.app.service.PromotionSendBalanceService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (PromotionSendBalance)表控制层
 *
 * @author bww
 * @since 2020-07-14 11:06:35
 */
@Api(tags = "")
@RestController
@RequestMapping("/promotionSendBalance/")
public class PromotionSendBalanceController {
    /**
     * 服务对象
     */
    @Resource
    private PromotionSendBalanceService promotionSendBalanceService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     * @Param storeId, account, batchno, standardNo 主键
     */
    @GetMapping("selectOne")
    public PromotionSendBalance selectOne(@RequestParam("storeId") String storeId, @RequestParam("account") String account, @RequestParam("batchno") String batchno, @RequestParam("standardNo") String standardNo) {
        return promotionSendBalanceService.queryById(storeId, account, batchno, standardNo);
    }

}