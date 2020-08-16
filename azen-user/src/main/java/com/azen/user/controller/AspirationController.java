package com.azen.user.controller;

import com.azen.user.bean.Aspiration;
import com.azen.user.service.AspirationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class AspirationController {
    private final AspirationService aspirationService;

    @Autowired
    public AspirationController(AspirationService aspirationService) {
        this.aspirationService = aspirationService;
    }

    @PostMapping("addAspiration")
    public Boolean addAspiration(Aspiration aspiration, HttpServletRequest request) {
        aspiration.setUId((Integer) request.getSession().getAttribute("userId"));
        if (aspirationService.addAspirationCount(aspiration) > 0) {
            return true;
        } else {
            return aspirationService.addAspiration(aspiration) > 0;
        }
    }

    @PostMapping("aspirationPageInfo")
    public PageInfo<Aspiration> aspirationPageInfo(@RequestParam(defaultValue = "1", name = "pageNumber") Integer pageNumber, HttpServletRequest request) {
        PageHelper.startPage(pageNumber, 5);
        return new PageInfo<>(aspirationService.aspirationListInFo((Integer) request.getSession().getAttribute("userId")));
    }

    @PostMapping("deleteAspirationInFo")
    public Boolean deleteAspirationInFo(Integer id) {
        return aspirationService.deleteAspirationInFo(id) > 0;
    }
}
