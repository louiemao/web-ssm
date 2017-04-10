package com.louie.ssm.controller;

import com.louie.ssm.model.User;
import com.louie.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private Logger log = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "showUser";
    }
}
