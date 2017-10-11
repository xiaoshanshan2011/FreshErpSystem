package com.erp.fresh.controller;

import com.erp.fresh.model.User;
import com.erp.fresh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestMybatis2 extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping("testmybatis")
    @ResponseBody
    private User test() {
        User user = userService.queryByName("shan");
        return user;
    }
}
