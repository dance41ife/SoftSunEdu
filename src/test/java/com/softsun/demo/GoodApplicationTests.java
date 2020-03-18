package com.softsun.demo;

import com.softsun.demo.dao.OrderMapper;
import com.softsun.demo.pojo.OrderBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GoodApplicationTests {
    @Autowired
    OrderMapper orderMapper;

    @Test
    void contextLoads() {
        System.out.println(orderMapper.selectSingleRow().get(0).getORDER_NUMBER());
    }

}
