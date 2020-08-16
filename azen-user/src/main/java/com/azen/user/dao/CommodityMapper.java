package com.azen.user.dao;

import com.azen.user.bean.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommodityMapper {
    List<Commodity> commodityListInFo(Integer id);

    Integer updateSpSl(List<Commodity> commodities);
}
