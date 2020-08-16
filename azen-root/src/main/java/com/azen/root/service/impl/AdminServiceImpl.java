package com.azen.root.service.impl;

import com.azen.root.bean.Admin;
import com.azen.root.dao.AdminMapper;
import com.azen.root.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private final AdminMapper adminMapper;

    @Autowired
    public AdminServiceImpl(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    @Override
    public Boolean selectAdminByLogin(Admin admin) {
        return adminMapper.selectAdminByLogin(admin);
    }

    @Override
    public List<Admin> adminListInFo(String name) {
        return adminMapper.adminListInFo(name);
    }

    @Override
    public Integer adminInsertInFo(Admin admin) {
        return adminMapper.adminInsertInFo(admin);
    }

    @Override
    public Integer adminUpdateInFo(Admin admin) {
        return adminMapper.adminUpdateInFo(admin);
    }

    @Override
    public Integer adminDeleteInFo(Integer id) {
        return adminMapper.adminDeleteInFo(id);
    }
}
