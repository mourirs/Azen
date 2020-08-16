package com.azen.root.controller;

import com.azen.root.bean.User;
import com.azen.root.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("userListInFos")
    public PageInfo<User> userListInFo(@RequestParam(defaultValue = "1", name = "pageNumber") Integer pageNumber, String name) {
        PageHelper.startPage(pageNumber, 6);
        return new PageInfo<>(userService.userListInFo(name));
    }

    @PostMapping("userUpdateForDong")
    public Boolean userUpdateForDong(Integer id) {
        return userService.userUpdateForDong(id) > 0;
    }

    @PostMapping("userUpdateForJie")
    public Boolean userUpdateForJie(Integer id) {
        return userService.userUpdateForJie(id) > 0;
    }
}
