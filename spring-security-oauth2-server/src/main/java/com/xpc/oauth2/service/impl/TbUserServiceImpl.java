package com.xpc.oauth2.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xpc.oauth2.mapper.TbUserMapper;
import com.xpc.oauth2.model.TbUser;
import com.xpc.oauth2.service.TbUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserService {
    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getUserByName(String name) {
        QueryWrapper<TbUser> wrapper = new QueryWrapper<>();
        wrapper.eq("username", name);
        return tbUserMapper.selectOne(wrapper);
    }
}
