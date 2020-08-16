package com.azen.root.controller;

import com.azen.root.bean.Admin;
import com.azen.root.service.AdminService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("adminLogin")
    public Boolean adminLogin(Admin admin, HttpServletRequest request) {
        if (adminService.selectAdminByLogin(admin) != null) {
            request.getSession().setAttribute("userEmail", admin.getAdEmail());
            return true;
        } else {
            return false;
        }
    }

    @PostMapping("adminListInFo")
    public PageInfo<Admin> adminListInFo(@RequestParam(defaultValue = "1", name = "pageNumber") Integer pageNumber, String name) {
        PageHelper.startPage(pageNumber, 6);
        return new PageInfo<>(adminService.adminListInFo(name));
    }

    @PostMapping("adminInsertInFo")
    public Boolean adminInsertInFo(Admin admin) {
        return adminService.adminInsertInFo(admin) > 0;
    }

    @PostMapping("adminUpdateInFo")
    public Boolean adminUpdateInFo(Admin admin) {
        return adminService.adminUpdateInFo(admin) > 0;
    }

    @PostMapping("adminDeleteInFo")
    public Boolean adminDeleteInFo(Integer id) {
        return adminService.adminDeleteInFo(id) > 0;
    }
}
