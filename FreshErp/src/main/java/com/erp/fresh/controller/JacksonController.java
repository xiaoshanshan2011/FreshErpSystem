package com.erp.fresh.controller;

import com.erp.fresh.model.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 陈俊山 on 16-12-18.
 */
@Controller
@RequestMapping("/controller")
public class JacksonController {

    @RequestMapping("userbean")
    @ResponseBody
    private UserBean getUserBean() {
        UserBean.Person person = new UserBean.Person("xiaoshasnhan", 25);
        List<UserBean.Person> list = new ArrayList<UserBean.Person>();
        for (int i = 0; i < 10F; i++) {
            list.add(person);
        }
        UserBean userBean = new UserBean(1001, "heheda", "https://www.33.jpg", "title", "广东省", true, list);
        return userBean;
    }
}
