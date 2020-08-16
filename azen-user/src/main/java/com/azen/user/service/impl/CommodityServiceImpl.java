package com.azen.user.service.impl;

import com.azen.user.bean.Commodity;
import com.azen.user.dao.CommodityMapper;
import com.azen.user.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = {Exception.class})
public class CommodityServiceImpl implements CommodityService {

    private final CommodityMapper commodityMapper;

    @Autowired
    public CommodityServiceImpl(CommodityMapper commodityMapper) {
        this.commodityMapper = commodityMapper;
    }

    @Override
    public List<Commodity> commodityListInFo(Integer id) {
        return commodityMapper.commodityListInFo(id);
    }
}
