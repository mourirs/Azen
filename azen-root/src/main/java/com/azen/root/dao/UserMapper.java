package com.azen.root.dao;

import com.azen.root.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    List<User> userListInFo(String name);

    Integer userUpdateForDong(Integer id);

    Integer userUpdateForJie(Integer id);

}
