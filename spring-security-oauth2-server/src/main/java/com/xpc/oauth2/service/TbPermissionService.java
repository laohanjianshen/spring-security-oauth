package com.xpc.oauth2.service;

import com.xpc.oauth2.model.TbPermission;

import java.util.List;

public interface TbPermissionService {
    List<TbPermission> getPermissionListByUserId(Long userId);
}
