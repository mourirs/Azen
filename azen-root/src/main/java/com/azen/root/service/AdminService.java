package com.azen.root.service;

import com.azen.root.bean.Admin;

import java.util.List;

public interface AdminService {
    Boolean selectAdminByLogin(Admin admin);
    List<Admin> adminListInFo(String name);
    Integer adminInsertInFo(Admin admin);
    Integer adminUpdateInFo(Admin admin);
    Integer adminDeleteInFo(Integer id);
}
