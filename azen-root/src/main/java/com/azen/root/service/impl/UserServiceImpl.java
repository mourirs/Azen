package com.azen.root.service.impl;

import com.azen.root.bean.User;
import com.azen.root.dao.UserMapper;
import com.azen.root.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> userListInFo(String name) {
        return userMapper.userListInFo(name);
    }

    @Override
    public Integer userUpdateForDong(Integer id) {
        return userMapper.userUpdateForDong(id);
    }

    @Override
    public Integer userUpdateForJie(Integer id) {
        return userMapper.userUpdateForJie(id);
    }
}
