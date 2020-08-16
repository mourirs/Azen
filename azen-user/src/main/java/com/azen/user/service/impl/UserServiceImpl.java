package com.azen.user.service.impl;

import com.azen.user.bean.User;
import com.azen.user.dao.UserMapper;
import com.azen.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = {Exception.class})
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public Boolean userLogin(User user) {
        return userMapper.userLogin(user);
    }

    @Override
    public Integer userRegister(User user) {
        return userMapper.userRegister(user);
    }

    @Override
    public User userLoginInspect(User user) {
        return userMapper.userLoginInspect(user);
    }

    @Override
    public Boolean userRetrieve(User user) {
        return userMapper.userRetrieve(user);
    }

    @Override
    public Integer userResetPwd(User user) {
        return userMapper.userResetPwd(user);
    }

    @Override
    public User userInFoById(Integer id) {
        return userMapper.userInFoById(id);
    }

    @Override
    public Integer userUpdateInFo(User user) {
        return userMapper.userUpdateInFo(user);
    }

    @Override
    public Integer userPhoneIsUse(User user) {
        return userMapper.userPhoneIsUse(user);
    }

    @Override
    public Boolean userPasswordIsTrue(User user) {
        return userMapper.userPasswordIsTrue(user);
    }
}
