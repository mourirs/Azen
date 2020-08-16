package com.azen.user.controller;

import com.azen.user.bean.Commodity;
import com.azen.user.service.CommodityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;


@RestController
public class CommodityController {
    private final CommodityService commodityService;

    @Autowired
    public CommodityController(CommodityService commodityService) {
        this.commodityService = commodityService;
    }

    @PostMapping("commodityListInFo")
    public PageInfo<Commodity> commodityListInFo(@RequestParam(defaultValue = "1", name = "pageNumber") Integer pageNumber, Integer id) {
        PageHelper.startPage(pageNumber, 12);
        return new PageInfo<>(commodityService.commodityListInFo(id));
    }

}
