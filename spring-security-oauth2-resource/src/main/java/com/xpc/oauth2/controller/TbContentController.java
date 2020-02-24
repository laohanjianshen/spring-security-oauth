package com.xpc.oauth2.controller;

import com.xpc.oauth2.model.ReturnEntity;
import com.xpc.oauth2.service.TbContentService;
import com.xpc.oauth2.util.ReturnUtil;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TbContentController {
    @Autowired
    private TbContentService tbContentService;

    @GetMapping("/")
    public ReturnEntity view() {
        var list = tbContentService.list();
        return ReturnUtil.success(list);
    }
}
