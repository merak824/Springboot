package com.xiaoqian.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaoqian.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    /**
     * 查找所有用户数据接口
     * @return
     */
    List<User> findAll();

    /**
     * 根据id查找用户数据接口
     * @return
     */
    List<User> selectById(Long id);
    
    /**
     * 新增用户信息（数据接口）
     */
    void add(User user);

    /**
     * 修改用户信息（数据接口）
     */
    void update(User user);
}
