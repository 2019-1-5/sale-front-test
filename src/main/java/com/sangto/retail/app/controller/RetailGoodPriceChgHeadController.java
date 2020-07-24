package com.sangto.retail.app.controller;

import com.sangto.retail.app.domain.RetailGoodPriceChgHead;
import com.sangto.retail.app.service.RetailGoodPriceChgHeadService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (RetailGoodPriceChgHead)表控制层
 *
 * @author bww
 * @since 2020-07-14 11:10:31
 */
@Api(tags = "")
@RestController
@RequestMapping("/retailGoodPriceChgHead/")
public class RetailGoodPriceChgHeadController {
    /**
     * 服务对象
     */
    @Resource
    private RetailGoodPriceChgHeadService retailGoodPriceChgHeadService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     * @Param chgno 主键
     */
    @GetMapping("selectOne")
    public RetailGoodPriceChgHead selectOne(@RequestParam("chgno") String chgno) {
        return retailGoodPriceChgHeadService.queryById(chgno);
    }

}