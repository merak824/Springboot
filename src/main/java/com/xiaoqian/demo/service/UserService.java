package com.xiaoqian.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaoqian.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    /**
     * 查找所有用户
     * @return
     */
    List<User> findAll();
    User selectById();
}
