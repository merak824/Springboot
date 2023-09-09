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
    public List<User> selectAll() {
        List<User> users = userMapper.selectAll();
        return users;
    }

    @Override
    public List<User> selectById(Long id) {
        List<User> user = userMapper.selectById(id);
        return user;
    }

    @Override
    public void add(User user){
        userMapper.add(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(Long id) {
        userMapper.delete(id);
    }
}
