package com.azen.user.dao;

import com.azen.user.bean.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderMapper {

    Integer insertInFo(List<Order> orderList);

    List<Order> orderInFo(Integer id);

    Integer deleteOrderInFo(Integer id);

}
