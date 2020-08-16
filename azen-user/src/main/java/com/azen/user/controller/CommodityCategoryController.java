package com.azen.user.controller;

import com.azen.user.bean.CommodityCategory;
import com.azen.user.service.CommodityCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommodityCategoryController {
    private final CommodityCategoryService commodityCategoryService;

    @Autowired
    public CommodityCategoryController(CommodityCategoryService commodityCategoryService) {
        this.commodityCategoryService = commodityCategoryService;
    }

    @PostMapping("commodityCategoryList")
    public List<CommodityCategory> commodityCategoryList() {
        return commodityCategoryService.commodityCategoryList();
    }
}
