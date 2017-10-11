package com.erp.fresh.controller;

import com.erp.fresh.model.User;
import com.erp.fresh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    private String login(HttpServletRequest request, Model model) {
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");

        if (userName == null || userName.length() <= 0) {
            return "login";
        }

        if (passWord == null || passWord.length() <= 0) {
            return "login";
        }

        User user = userService.queryByName(userName);
        if (user == null || !user.getPassword().equals(passWord)) {
            return "login";
        }

        return "home";
    }

    @RequestMapping(value = "index")
    private String index() {
        return "login";
    }
}
