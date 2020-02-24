package com.xpc.oauth2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xpc.oauth2.mapper.TbContentMapper;
import com.xpc.oauth2.model.TbContent;
import com.xpc.oauth2.service.TbContentService;
import org.springframework.stereotype.Service;

@Service
public class TbContentServiceImpl extends ServiceImpl<TbContentMapper, TbContent> implements TbContentService {
}
