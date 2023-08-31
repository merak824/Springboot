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
//@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    //查找所有用户信息
    @GetMapping("/findAll")
    public Result findAll() {
        List<User> users = userService.findAll();
        return Result.success(users);
    }

    //根据id查找用户信息
    @GetMapping("/selectById")
    public Result selectById(Long id){
        List<User> users = userService.selectById(id);
        return Result.success(users);
    }

    //添加用户信息
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


    //修改用户信息
    @PostMapping("/update")
    public Result update(@RequestBody User user){
        userService.update(user);
        return Result.success();
    }

    //根据id删除用户信息
    @DeleteMapping("/delete")
    public Result delete(Integer id){
        userService.deletes(id);
        return Result.success();
    }
}
