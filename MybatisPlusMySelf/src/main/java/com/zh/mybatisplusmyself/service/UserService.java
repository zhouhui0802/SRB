package com.zh.mybatisplusmyself.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zh.mybatisplusmyself.entity.User;

import java.util.List;

public interface UserService extends IService<User> {

    List<User> listAllByName(String name);
}
