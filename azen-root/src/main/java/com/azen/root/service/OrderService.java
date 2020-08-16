package com.azen.root.service;

import com.azen.root.bean.Order;

import java.util.List;

public interface OrderService {
    List<Order> orderListInFo(String name);
}
