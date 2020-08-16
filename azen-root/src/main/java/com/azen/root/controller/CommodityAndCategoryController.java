package com.azen.root.controller;

import com.azen.root.bean.Commodity;
import com.azen.root.bean.CommodityCategory;
import com.azen.root.service.CommodityAndCategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommodityAndCategoryController {
    private final CommodityAndCategoryService commodityAndCategoryService;

    @Autowired
    public CommodityAndCategoryController(CommodityAndCategoryService commodityAndCategoryService) {
        this.commodityAndCategoryService = commodityAndCategoryService;
    }


    @PostMapping("commodityListInFo")
    public PageInfo<Commodity> commodityListInFo(@RequestParam(defaultValue = "1", name = "pageNumber") Integer pageNumber, String name) {
        PageHelper.startPage(pageNumber, 5);
        return new PageInfo<>(commodityAndCategoryService.commodityListInFo(name));
    }

    @PostMapping("commodityUpdateInFo")
    public Integer commodityUpdateInFo(Commodity commodity) {
        return commodityAndCategoryService.commodityUpdateInFo(commodity);
    }

    @PostMapping("commodityInsertInFo")
    public Integer commodityInsertInFo(Commodity commodity) {
        return commodityAndCategoryService.commodityInsertInFo(commodity);
    }

    @PostMapping("commodityUpdateUp")
    public Integer commodityUpdateUp(Integer id) {
        return commodityAndCategoryService.commodityUpdateUp(id);
    }

    @PostMapping("commodityUpdateDown")
    public Integer commodityUpdateDown(Integer id) {
        return commodityAndCategoryService.commodityUpdateDown(id);
    }

    @PostMapping("commodityCategoryList")
    public List<CommodityCategory> commodityCategoryList() {
        return commodityAndCategoryService.commodityCategoryList();
    }


}
