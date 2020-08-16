package com.azen.user.service.impl;

import com.azen.user.bean.Commodity;
import com.azen.user.bean.Order;
import com.azen.user.dao.CarMapper;
import com.azen.user.dao.CommodityMapper;
import com.azen.user.dao.OrderMapper;
import com.azen.user.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = {Exception.class})
public class OrderServiceImpl implements OrderService {

    private final OrderMapper orderMapper;
    private final CarMapper carMapper;
    private final CommodityMapper commodityMapper;

    @Autowired
    public OrderServiceImpl(OrderMapper orderMapper, CarMapper carMapper, CommodityMapper commodityMapper) {
        this.orderMapper = orderMapper;
        this.carMapper = carMapper;
        this.commodityMapper = commodityMapper;
    }

    @Override
    public Integer insertInFo(List<Order> orderList) {
        return orderMapper.insertInFo(orderList);
    }

    @Override
    public List<Order> orderInFo(Integer id) {
        return orderMapper.orderInFo(id);
    }

    @Override
    public Integer deleteOrderInFo(Integer id) {
        return orderMapper.deleteOrderInFo(id);
    }

    @Override
    public Integer deleteCarForIdIsListId(List<Integer> id) {
        return carMapper.deleteCarForIdIsListId(id);
    }

    @Override
    public Integer updateSpSl(List<Commodity> commodities) {
        return commodityMapper.updateSpSl(commodities);
    }
}
