package com.erp.fresh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PagesController {
    @RequestMapping(value = "login")
    private String login() {
        return "login";
    }
}
