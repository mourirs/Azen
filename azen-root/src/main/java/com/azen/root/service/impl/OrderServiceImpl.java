package com.azen.root.service.impl;

import com.azen.root.bean.Order;
import com.azen.root.dao.OrderMapper;
import com.azen.root.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderMapper orderMapper;

    @Autowired
    public OrderServiceImpl(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Override
    public List<Order> orderListInFo(String name) {
        return orderMapper.orderListInFo(name);
    }
}
