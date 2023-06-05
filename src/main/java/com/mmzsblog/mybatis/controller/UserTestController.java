package com.mmzsblog.mybatis.controller;


import com.mmzsblog.mybatis.api.CommonResult;
import com.mmzsblog.mybatis.service.IUserTestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mmzsit
 * @since 2023-06-06
 */
@RestController
@RequestMapping("/userTest")
public class UserTestController {

    @Resource
    private IUserTestService userTestService;

    @GetMapping("/test")
    public CommonResult<?> test() {
        return CommonResult.success(userTestService.test());
    }

}

