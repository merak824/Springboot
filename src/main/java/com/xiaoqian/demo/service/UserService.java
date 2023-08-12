package com.xiaoqian.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaoqian.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    /**
     * 查找所有用户业务接口
     * @return
     */
    List<User> findAll();

    /**
     * 通过id查找用户业务接口
     * @return
     */
    User selectById();

    /**
     * 新增用户业务接口
     */

    String add(User user);
}
