package com.azen.root.dao;

import com.azen.root.bean.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdminMapper {
    Boolean selectAdminByLogin(Admin admin);

    List<Admin> adminListInFo(String name);

    Integer adminInsertInFo(Admin admin);

    Integer adminUpdateInFo(Admin admin);

    Integer adminDeleteInFo(Integer id);
}
