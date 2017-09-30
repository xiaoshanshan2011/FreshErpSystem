package com.erp.fresh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "login", method = RequestMethod.POST)
    private String login(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("passWord");

        if (!"shan".equals(userName)) {

        }

        if (!"123456".equals(password)) {

        }
        return "home";
    }

    @RequestMapping(value = "index")
    private String index() {
        return "login";
    }
}
