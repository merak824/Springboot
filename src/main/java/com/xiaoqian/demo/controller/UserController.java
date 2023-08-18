package com.xiaoqian.demo.controller;

import com.xiaoqian.demo.entity.User;
import com.xiaoqian.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.*;
import com.xiaoqian.demo.common.Result;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/findAll")
    public Result findAll() {
        List<User> users = userService.findAll();
        return Result.success(users);
    }

    @GetMapping("/selectById")
    List<User> selectById(Long id){
        List<User> users = userService.selectById(id);
        return users;
    }

    @PostMapping("/add")
    public Result add(@RequestBody User user){
        //通过MySQL索引的方式判断用户是否存在
        try {
            userService.add(user);
        }catch (Exception e){
            if(e instanceof DuplicateKeyException){
                return Result.error("该用户已存在");
            }else {
                return Result.error("系统错误");
            }
        }
        return Result.success();
    }

    @PostMapping("/update")
    public Result update(@RequestBody User user){
        userService.update(user);
        return Result.success();
    }
}
