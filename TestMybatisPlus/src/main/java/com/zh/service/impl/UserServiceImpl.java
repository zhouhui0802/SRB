package com.zh.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zh.entity.User;
import com.zh.mapper.UserMapper;
import com.zh.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Override
    public List<User> listAllByName(String name) {
        return baseMapper.selectAllByName("Hellen");
    }
}
