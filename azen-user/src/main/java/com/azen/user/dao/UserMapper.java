package com.azen.user.dao;

import com.azen.user.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    Boolean userLogin(User user);

    Integer userRegister(User user);

    User userLoginInspect(User user);

    Boolean userRetrieve(User user);

    Integer userResetPwd(User user);

    User userInFoById(Integer id);

    Integer userUpdateInFo(User user);

    Integer userPhoneIsUse(User user);

    Boolean userPasswordIsTrue(User user);
}
