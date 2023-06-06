package com.mmzsblog.mybatis.controller;


import com.mmzsblog.mybatis.api.CommonResult;
import com.mmzsblog.mybatis.service.IUserOtherService;
import com.mmzsblog.mybatis.service.IUserTestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试多数据源
 *
 * @author mmzsblog.cn
 * @since 2023-06-06
 */
@RestController
@RequestMapping("/multiple")
public class MultipleController {

    @Resource
    private IUserTestService userTestService;

    @Resource
    private IUserOtherService userOtherService;

    @GetMapping("/master")
    public CommonResult<?> testMaster() {
        return CommonResult.success(userTestService.test());
    }

    @GetMapping("/slave")
    public CommonResult<?> testSlave() {
        return CommonResult.success(userOtherService.test());
    }


}

