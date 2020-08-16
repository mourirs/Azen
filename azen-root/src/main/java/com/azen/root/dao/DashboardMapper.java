package com.azen.root.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DashboardMapper {

    @Select("SELECT COUNT(*) FROM sp_order")
    Integer orderCount();

    @Select("SELECT COUNT(*) FROM sp_user")
    Integer userCount();

    @Select("SELECT SUM(conum) FROM sp_commodity")
    Integer commodityCount();

    @Select("SELECT SUM(sp_order.ogold) FROM sp_order")
    Integer profitSum();

}
