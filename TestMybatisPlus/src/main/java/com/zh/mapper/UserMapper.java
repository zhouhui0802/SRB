package com.zh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zh.entity.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> selectAllByName(String name);
}
