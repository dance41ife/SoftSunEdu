package com.softsun.demo.controller;

import com.softsun.demo.dao.OrderMapper;
import com.softsun.demo.pojo.OrderBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mainController {
    @Autowired
    OrderMapper orderMapper;

    @ResponseBody
    @RequestMapping(value = "/doPost",method = RequestMethod.POST)
    public OrderBean receiveRequest(){
        OrderBean ob = orderMapper.selectSingleRow().get(0);
        return ob;
    }
}
