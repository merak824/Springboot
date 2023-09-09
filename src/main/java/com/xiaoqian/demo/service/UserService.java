package com.xiaoqian.demo.service;

import com.xiaoqian.demo.common.Result;
import com.xiaoqian.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    /**
     * 查找所有用户信息（业务接口）
     * @return
     */
    List<User> selectAll();

    /**
     * 通过id查找用户信息（业务接口）
     *
     * @return
     */
    List<User> selectById(Long id);

    /**
     * 新增用户信息（业务接口）
     */
    void add(User user);

    /**
     * 修改用户信息（业务接口）
     */
    void update(User user);

    /**
     * 删除用户信息（业务接口）
     */
    void delete(Long id);
}
