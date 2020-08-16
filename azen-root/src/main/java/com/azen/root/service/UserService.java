package com.azen.root.service;

import com.azen.root.bean.User;

import java.util.List;

public interface UserService {
    List<User> userListInFo(String name);

    Integer userUpdateForDong(Integer id);

    Integer userUpdateForJie(Integer id);
}
