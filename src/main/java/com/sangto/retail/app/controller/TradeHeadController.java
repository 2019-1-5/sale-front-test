package com.sangto.retail.app.controller;

import com.sangto.retail.app.domain.TradeHead;
import com.sangto.retail.app.service.TradeHeadService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (TradeHead)表控制层
 *
 * @author bww
 * @since 2020-07-14 11:15:38
 */
@Api(tags = "")
@RestController
@RequestMapping("/tradeHead/")
public class TradeHeadController {
    /**
     * 服务对象
     */
    @Resource
    private TradeHeadService tradeHeadService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     * @Param shopNo, workDay, tradeNo 主键
     */
    @GetMapping("selectOne")
    public TradeHead selectOne(@RequestParam("shopNo") String shopNo, @RequestParam("workDay") String workDay, @RequestParam("tradeNo") String tradeNo) {
        return tradeHeadService.queryById(shopNo, workDay, tradeNo);
    }

}