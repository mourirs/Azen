package com.azen.root.service.impl;

import com.azen.root.dao.DashboardMapper;
import com.azen.root.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardServiceImpl implements DashboardService {

    private final DashboardMapper dashboardMapper;

    @Autowired
    public DashboardServiceImpl(DashboardMapper dashboardMapper) {
        this.dashboardMapper = dashboardMapper;
    }

    @Override
    public Integer orderCount() {
        return dashboardMapper.orderCount();
    }

    @Override
    public Integer userCount() {
        return dashboardMapper.userCount();
    }

    @Override
    public Integer commodityCount() {
        return dashboardMapper.commodityCount();
    }

    @Override
    public Integer profitSum() {
        return dashboardMapper.profitSum();
    }
}
