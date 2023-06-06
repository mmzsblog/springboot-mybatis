package com.mmzsblog.mybatis.controller;


import com.mmzsblog.mybatis.api.CommonResult;
import com.mmzsblog.mybatis.service.IUserTestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试单数据源
 *
 * @author mmzsblog.cn
 * @since 2023-06-06
 */
@RestController
@RequestMapping("/single")
public class SingleController {

    @Resource
    private IUserTestService userTestService;

    @GetMapping("/test")
    public CommonResult<?> test() {
        return CommonResult.success(userTestService.test());
    }

}

