package com.azen.root.dao;

import com.azen.root.bean.CommodityCategory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommodityCategoryMapper {

    List<CommodityCategory> commodityCategoryList();

}
