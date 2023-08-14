package com.xiaoqian.demo.controller;

import com.xiaoqian.demo.entity.User;
import com.xiaoqian.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add")
    public String add(@RequestBody User user){
        userService.add(user);
        return "添加成功！";
    }

    @GetMapping("/selectById")
    List<User> selectById(Long id){
        List<User> users = userService.selectById(id);
        return users;
    }
}
