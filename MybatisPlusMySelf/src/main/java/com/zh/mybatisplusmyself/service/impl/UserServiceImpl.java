package com.zh.mybatisplusmyself.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zh.mybatisplusmyself.entity.User;
import com.zh.mybatisplusmyself.mapper.UserMapper;
import com.zh.mybatisplusmyself.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Override
    public List<User> listAllByName(String name) {
        return baseMapper.selectAllByName("Hellen");
    }
}
