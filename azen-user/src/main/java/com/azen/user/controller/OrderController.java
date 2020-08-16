package com.azen.user.controller;

import com.azen.user.bean.Commodity;
import com.azen.user.bean.Order;
import com.azen.user.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("addOrderInFos")
    public Boolean addOrderInFo(HttpServletRequest request) {
        String order = request.getParameter("order");
        List<Map<String, Object>> collection = (List<Map<String, Object>>) JSONArray.toCollection(JSONArray.fromObject(order), Map.class);
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        List<Order> orders = new ArrayList<>();
        List<Integer> carId = new ArrayList<>();
        List<Commodity> commodityList = new ArrayList<>();
        for (Map<String, Object> stringObjectMap : collection) {
            carId.add(Integer.parseInt(String.valueOf(stringObjectMap.get("cId"))));
            commodityList.add(new Commodity(
                    Integer.parseInt(String.valueOf(stringObjectMap.get("coId"))),
                    Integer.parseInt(String.valueOf(stringObjectMap.get("coNum")))));
            orders.add(new Order(
                    userId,
                    String.valueOf(stringObjectMap.get("oNumber")),
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()),
                    Integer.parseInt(String.valueOf(stringObjectMap.get("oGold"))),
                    Integer.parseInt(String.valueOf(stringObjectMap.get("aId"))),
                    String.valueOf(stringObjectMap.get("oName")),
                    Integer.parseInt(String.valueOf(stringObjectMap.get("oPrice"))),
                    Integer.parseInt(String.valueOf(stringObjectMap.get("oNum"))),
                    Integer.parseInt(String.valueOf(stringObjectMap.get("oStatue")))
            ));
        }

        if (orderService.insertInFo(orders) > 0) {
            orderService.deleteCarForIdIsListId(carId);
            orderService.updateSpSl(commodityList);
            return true;
        } else {
            return false;
        }

    }

    @PostMapping("orderPageInFo")
    public PageInfo<Order> getOrderInFo(@RequestParam(defaultValue = "1", name = "pageNumber") Integer pageNumber, HttpServletRequest request) {
        PageHelper.startPage(pageNumber, 5);
        List<Order> orders = orderService.orderInFo((Integer) request.getSession().getAttribute("userId"));
        return new PageInfo<>(orders);
    }

    @PostMapping("deleteOrderInFo")
    public Boolean deleteOrderInFo(Integer id) {
        return orderService.deleteOrderInFo(id) > 0;
    }

}
