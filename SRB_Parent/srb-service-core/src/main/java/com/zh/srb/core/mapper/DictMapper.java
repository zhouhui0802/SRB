package com.zh.srb.core.mapper;

import com.zh.srb.core.pojo.dto.ExcelDictDTO;
import com.zh.srb.core.pojo.entity.Dict;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 数据字典 Mapper 接口
 * </p>
 *
 * @author zhouhui
 * @since 2025-12-08
 */
public interface DictMapper extends BaseMapper<Dict> {

    void insertBatch(List<ExcelDictDTO> list);

}
