package com.sangto.retail.app.controller;

import com.sangto.retail.app.domain.RetailGoodCls;
import com.sangto.retail.app.service.RetailGoodClsService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (RetailGoodCls)表控制层
 *
 * @author bww
 * @since 2020-07-14 11:10:28
 */
@Api(tags = "")
@RestController
@RequestMapping("/retailGoodCls/")
public class RetailGoodClsController {
    /**
     * 服务对象
     */
    @Resource
    private RetailGoodClsService retailGoodClsService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     * @Param clsId 主键
     */
    @GetMapping("selectOne")
    public RetailGoodCls selectOne(@RequestParam("clsId") Integer clsId) {
        return retailGoodClsService.queryById(clsId);
    }

}