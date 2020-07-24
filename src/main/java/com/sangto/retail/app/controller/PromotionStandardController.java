package com.sangto.retail.app.controller;

import com.sangto.retail.app.domain.PromotionStandard;
import com.sangto.retail.app.service.PromotionStandardService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (PromotionStandard)表控制层
 *
 * @author bww
 * @since 2020-07-14 11:06:37
 */
@Api(tags = "")
@RestController
@RequestMapping("/promotionStandard/")
public class PromotionStandardController {
    /**
     * 服务对象
     */
    @Resource
    private PromotionStandardService promotionStandardService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     * @Param standardNo 主键
     */
    @GetMapping("selectOne")
    public PromotionStandard selectOne(@RequestParam("standardNo") String standardNo) {
        return promotionStandardService.queryById(standardNo);
    }

}