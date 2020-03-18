package com.softsun.demo.dao;

import com.softsun.demo.pojo.OrderBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {
    List<OrderBean> selectSingleRow();
}
