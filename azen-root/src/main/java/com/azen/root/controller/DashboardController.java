package com.azen.root.controller;

import com.azen.root.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

    private final DashboardService dashboardService;

    @Autowired
    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @PostMapping("orderCount")
    public Integer orderCount() {
        return dashboardService.orderCount();
    }

    @PostMapping("userCount")
    public Integer userCount() {
        return dashboardService.userCount();
    }

    @PostMapping("commodityCount")
    public Integer commodityCount() {
        return dashboardService.commodityCount();
    }

    @PostMapping("profitSum")
    public Integer profitSum() {
        return dashboardService.profitSum();
    }
}
