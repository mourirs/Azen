package com.azen.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Router {

    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @RequestMapping("login")
    public String login() {
        return "login";
    }

    @RequestMapping("information")
    public String information() {
        return "information";
    }

    @RequestMapping("shop")
    public String shop() {
        return "shop";
    }

    @RequestMapping("wishlist")
    public String wishlist() {
        return "wishlist";
    }

    @RequestMapping("cart")
    public String cart() {
        return "cart";
    }

    @RequestMapping("checkout")
    public String checkout() {
        return "checkout";
    }

    @RequestMapping("orderIF")
    public String orderIF() {
        return "order";
    }

    @RequestMapping("contact")
    public String contact() {
        return "contact";
    }
}
