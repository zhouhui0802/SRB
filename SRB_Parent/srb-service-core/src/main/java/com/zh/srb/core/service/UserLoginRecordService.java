package com.zh.srb.core.service;

import com.zh.srb.core.pojo.entity.UserLoginRecord;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户登录记录表 服务类
 * </p>
 *
 * @author zhouhui
 * @since 2025-12-08
 */
public interface UserLoginRecordService extends IService<UserLoginRecord> {
    List<UserLoginRecord> listTop50(Long userId);
}
