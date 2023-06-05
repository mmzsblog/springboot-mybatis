package com.mmzsblog.mybatis.service.impl;

import com.mmzsblog.mybatis.mapper.IUserTestMapper;
import com.mmzsblog.mybatis.service.IUserTestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author mmzsit
 * @since 2023-06-06
 */
@Service
public class UserTestServiceImpl implements IUserTestService {

    @Resource
    private IUserTestMapper userTestMapper;

    @Override
    public List<String> test() {
        return userTestMapper.test();
    }
}
