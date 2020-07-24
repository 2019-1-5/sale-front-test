package com.sangto.retail.app.controller;

import com.sangto.retail.app.domain.RetailGoodPrice;
import com.sangto.retail.app.service.RetailGoodPriceService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (RetailGoodPrice)表控制层
 *
 * @author bww
 * @since 2020-07-14 11:10:29
 */
@Api(tags = "")
@RestController
@RequestMapping("/retailGoodPrice/")
public class RetailGoodPriceController {
    /**
     * 服务对象
     */
    @Resource
    private RetailGoodPriceService retailGoodPriceService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     * @Param storeId, gdno 主键
     */
    @GetMapping("selectOne")
    public RetailGoodPrice selectOne(@RequestParam("storeId") String storeId, @RequestParam("gdno") String gdno) {
        return retailGoodPriceService.queryById(storeId, gdno);
    }

}