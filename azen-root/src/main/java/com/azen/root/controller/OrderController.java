package com.azen.root.controller;

import com.azen.root.bean.Order;
import com.azen.root.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("orderListInFo")
    public PageInfo<Order> orderListInFo(@RequestParam(defaultValue = "1", name = "pageNumber") Integer pageNumber, String name) {
        PageHelper.startPage(pageNumber, 5);
        return new PageInfo<>(orderService.orderListInFo(name));
    }

}
