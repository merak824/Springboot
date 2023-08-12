package com.xiaoqian.demo.service.impl;

import com.xiaoqian.demo.entity.User;
import com.xiaoqian.demo.mapper.UserMapper;
import com.xiaoqian.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> findAll() {
        List<User> users = userMapper.findAll();
        return users;
    }

    @Override
    public User selectById() {
        User user = userMapper.selectById();
        return user;
    }

    @Override
    public String add(User user){
        userMapper.add(user);
        return "新增成功";
    }
}
