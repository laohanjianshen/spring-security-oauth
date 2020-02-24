package com.xpc.oauth2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xpc.oauth2.mapper.TbPermissionMapper;
import com.xpc.oauth2.model.TbPermission;
import com.xpc.oauth2.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbPermissionServiceImpl extends ServiceImpl<TbPermissionMapper, TbPermission> implements TbPermissionService {
    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> getPermissionListByUserId(Long userId) {
        return tbPermissionMapper.selectListByUserId(userId);
    }
}
