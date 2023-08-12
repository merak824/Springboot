package com.xiaoqian.demo.controller;

import com.xiaoqian.demo.entity.User;
import com.xiaoqian.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/findAll")
    List<User> findAll() {
        List<User> users = userService.findAll();
        System.out.println(users);
        return users;
    }

    @GetMapping("/selectById")
    User selectById(){
        User users =userService.selectById();
        System.out.println(users);
        return users;
    }
}
