package com.xiaoqian.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (User)表实体类
 *
 * @author makejava
 * @since 2023-08-18 11:50:50
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    //id
    private Integer id;
    //用户名
    private String username;
    //密码
    private String password;
    //姓名
    private String name;
    //电话
    private String phone;
    //邮箱
    private String email;
    //地址
    private String address;
    //头像
    private String avatar;

}

