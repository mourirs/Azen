package com.azen.user.controller;

import com.azen.user.bean.User;
import com.azen.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@RequestMapping
@Controller
@Slf4j
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("userLogin")
    @ResponseBody
    public Boolean userLogin(User user, HttpServletRequest request) {
        if (userService.userLogin(user) != null) {
            request.getSession().setAttribute("userId", userService.userLoginInspect(user).getUId());
            request.getSession().setAttribute("userName", user.getUName());
            return true;
        } else {
            return false;
        }
    }

    @RequestMapping("userLogout")
    public String userLogout(HttpServletRequest request) {
        request.getSession().removeAttribute("userName");
        request.getSession().removeAttribute("userId");
        return "index";
    }

    @PostMapping("userRegister")
    @ResponseBody
    public Boolean userRegister(User user) {
        return userService.userRegister(user) > 0;
    }

    @PostMapping("userRetrieve")
    @ResponseBody
    public Boolean userRetrieve(User user) {
        return userService.userRetrieve(user) != null;
    }

    @PostMapping("userResetPwd")
    @ResponseBody
    public Boolean userResetPwd(User user) {
        return userService.userResetPwd(user) > 0;
    }

    @PostMapping("userInFo")
    @ResponseBody
    public User userInFoById(HttpServletRequest request) {
        return userService.userInFoById((Integer) request.getSession().getAttribute("userId"));
    }

    @PostMapping("userUpdateInFo")
    @ResponseBody
    public Boolean userUpdateInFo(User user) {
        if (userService.userPhoneIsUse(user) != 0) {
            return false;
        } else {
            return userService.userUpdateInFo(user) > 0;
        }
    }

    @PostMapping("userUpdatePwd")
    @ResponseBody
    public Boolean userUpdatePwd(User user, String newPassword) {
        if (userService.userPasswordIsTrue(user) != null) {
            user.setUPwd(newPassword);
            return userService.userUpdateInFo(user) > 0;
        } else {
            return false;
        }
    }
}
