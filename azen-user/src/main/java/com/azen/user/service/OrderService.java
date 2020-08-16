package com.azen.user.service;

import com.azen.user.bean.Commodity;
import com.azen.user.bean.Order;

import java.util.List;

public interface OrderService {

    Integer insertInFo(List<Order> orderList);

    List<Order> orderInFo(Integer id);

    Integer deleteOrderInFo(Integer id);

    Integer deleteCarForIdIsListId(List<Integer> id);

    Integer updateSpSl(List<Commodity> commodities);

}
