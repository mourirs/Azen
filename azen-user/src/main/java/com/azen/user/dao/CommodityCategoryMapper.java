package com.azen.user.dao;

import com.azen.user.bean.CommodityCategory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommodityCategoryMapper {

    List<CommodityCategory> commodityCategoryList();

}
