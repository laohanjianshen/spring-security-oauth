package com.xpc.oauth2;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan(basePackages = "com.xpc.oauth2.mapper")
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

}
