package com.azen.root.dao;

import com.azen.root.bean.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommodityMapper {

    List<Commodity> commodityListInFo(String name);

    Integer commodityUpdateInFo(Commodity commodity);

    Integer commodityInsertInFo(Commodity commodity);

    Integer commodityUpdateUp(Integer id);

    Integer commodityUpdateDown(Integer id);
}
