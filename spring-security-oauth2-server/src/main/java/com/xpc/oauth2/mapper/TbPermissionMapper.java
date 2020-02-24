package com.xpc.oauth2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xpc.oauth2.model.TbPermission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TbPermissionMapper extends BaseMapper<TbPermission> {
    List<TbPermission> selectListByUserId(Long userId);
}
