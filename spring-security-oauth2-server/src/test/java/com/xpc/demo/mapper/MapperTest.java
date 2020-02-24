package com.xpc.demo.mapper;

import com.xpc.oauth2.Oauth2ServerApplication;
import com.xpc.oauth2.mapper.TbPermissionMapper;
import com.xpc.oauth2.model.TbPermission;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = Oauth2ServerApplication.class)
@RunWith(SpringRunner.class)
public class MapperTest {
    @Resource
    private TbPermissionMapper permissionMapper;

    @Test
    public void TestPermissionMapper() {
        List<TbPermission> permissions = permissionMapper.selectListByUserId(37L);
        permissions.forEach(System.out::print);
    }
}