package com.azen.user.dao;

import com.azen.user.bean.Aspiration;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AspirationMapper {

    Integer addAspiration(Aspiration aspiration);

    Integer addAspirationCount(Aspiration aspiration);

    List<Aspiration> aspirationListInFo(Integer id);

    Integer deleteAspirationInFo(Integer id);
}
