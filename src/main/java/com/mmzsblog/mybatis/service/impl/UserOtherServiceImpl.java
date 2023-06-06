package com.mmzsblog.mybatis.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.mmzsblog.mybatis.mapper.IUserOtherMapper;
import com.mmzsblog.mybatis.service.IUserOtherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author mmzsblog.cn
 * @since 2023-06-06
 */
@DS("slave")
@Service
public class UserOtherServiceImpl implements IUserOtherService {

    @Resource
    private IUserOtherMapper userOtherMapper;
    @Override
    public List<String> test() {
        return userOtherMapper.test();
    }
}
