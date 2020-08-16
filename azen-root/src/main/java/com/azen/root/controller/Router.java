package com.azen.root.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Router {
    @RequestMapping("login")
    public String login() {
        return "login";
    }

    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @RequestMapping("administrator")
    public String administrator() {
        return "administrator";
    }

    @RequestMapping("userManagement")
    public String userManagement() {
        return "userManagement";
    }

    @RequestMapping("orderManagement")
    public String orderManagement() {
        return "orderManagement";
    }

    @RequestMapping("commodityManagement")
    public String commodityManagement() {
        return "commodityManagement";
    }
}
