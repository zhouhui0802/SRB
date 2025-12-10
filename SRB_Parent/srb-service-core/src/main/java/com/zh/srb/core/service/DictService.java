package com.zh.srb.core.service;

import com.zh.srb.core.pojo.entity.Dict;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.InputStream;

/**
 * <p>
 * 数据字典 服务类
 * </p>
 *
 * @author zhouhui
 * @since 2025-12-08
 */
public interface DictService extends IService<Dict> {

    void importData(InputStream inputStream);
}
