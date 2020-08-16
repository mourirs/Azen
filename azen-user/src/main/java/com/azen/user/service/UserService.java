package com.azen.user.service;

import com.azen.user.bean.User;

public interface UserService {
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
