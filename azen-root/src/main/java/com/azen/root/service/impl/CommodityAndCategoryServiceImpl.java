package com.azen.root.service.impl;

import com.azen.root.bean.Commodity;
import com.azen.root.bean.CommodityCategory;
import com.azen.root.dao.CommodityCategoryMapper;
import com.azen.root.dao.CommodityMapper;
import com.azen.root.service.CommodityAndCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityAndCategoryServiceImpl implements CommodityAndCategoryService {
    private final CommodityMapper commodityMapper;
    private final CommodityCategoryMapper commodityCategoryMapper;

    @Autowired
    public CommodityAndCategoryServiceImpl(CommodityMapper commodityMapper, CommodityCategoryMapper commodityCategoryMapper) {
        this.commodityMapper = commodityMapper;
        this.commodityCategoryMapper = commodityCategoryMapper;
    }

    @Override
    public List<Commodity> commodityListInFo(String name) {
        return commodityMapper.commodityListInFo(name);
    }

    @Override
    public Integer commodityUpdateInFo(Commodity commodity) {
        return commodityMapper.commodityUpdateInFo(commodity);
    }

    @Override
    public Integer commodityInsertInFo(Commodity commodity) {
        return commodityMapper.commodityInsertInFo(commodity);
    }

    @Override
    public Integer commodityUpdateUp(Integer id) {
        return commodityMapper.commodityUpdateUp(id);
    }

    @Override
    public Integer commodityUpdateDown(Integer id) {
        return commodityMapper.commodityUpdateDown(id);
    }

    @Override
    public List<CommodityCategory> commodityCategoryList() {
        return commodityCategoryMapper.commodityCategoryList();
    }
}
