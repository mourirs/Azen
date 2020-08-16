package com.azen.user.service.impl;

import com.azen.user.bean.CommodityCategory;
import com.azen.user.dao.CommodityCategoryMapper;
import com.azen.user.service.CommodityCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = {Exception.class})
public class CommodityCategoryServiceImpl implements CommodityCategoryService {
    private final CommodityCategoryMapper commodityCategoryMapper;

    @Autowired
    public CommodityCategoryServiceImpl(CommodityCategoryMapper commodityCategoryMapper) {
        this.commodityCategoryMapper = commodityCategoryMapper;
    }

    @Override
    public List<CommodityCategory> commodityCategoryList() {
        return commodityCategoryMapper.commodityCategoryList();
    }
}
