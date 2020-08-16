package com.azen.root.service;

import com.azen.root.bean.Commodity;
import com.azen.root.bean.CommodityCategory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommodityAndCategoryService {
    List<Commodity> commodityListInFo(String name);

    Integer commodityUpdateInFo(Commodity commodity);

    Integer commodityInsertInFo(Commodity commodity);

    Integer commodityUpdateUp(Integer id);

    Integer commodityUpdateDown(Integer id);

    List<CommodityCategory> commodityCategoryList();
}
