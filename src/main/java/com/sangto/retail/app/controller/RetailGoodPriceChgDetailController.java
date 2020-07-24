package com.sangto.retail.app.controller;

import com.sangto.retail.app.domain.RetailGoodPriceChgDetail;
import com.sangto.retail.app.service.RetailGoodPriceChgDetailService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (RetailGoodPriceChgDetail)表控制层
 *
 * @author bww
 * @since 2020-07-14 11:10:30
 */
@Api(tags = "")
@RestController
@RequestMapping("/retailGoodPriceChgDetail/")
public class RetailGoodPriceChgDetailController {
    /**
     * 服务对象
     */
    @Resource
    private RetailGoodPriceChgDetailService retailGoodPriceChgDetailService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     * @Param chgno, seq 主键
     */
    @GetMapping("selectOne")
    public RetailGoodPriceChgDetail selectOne(@RequestParam("chgno") String chgno, @RequestParam("seq") Integer seq) {
        return retailGoodPriceChgDetailService.queryById(chgno, seq);
    }

}