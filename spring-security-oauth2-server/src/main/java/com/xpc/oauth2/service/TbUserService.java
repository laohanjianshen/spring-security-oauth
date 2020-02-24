package com.xpc.oauth2.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xpc.oauth2.model.TbUser;

public interface TbUserService extends IService<TbUser> {
    TbUser getUserByName(String name);
}
