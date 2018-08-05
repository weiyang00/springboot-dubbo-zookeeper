package com.example.springbootdemo.service;


import com.example.springbootdemo.domain.User;

/**
 * 用户业务接口层
 *
 * Created by bysocket on 07/02/2017.
 */
public interface UserOutService {

    /**
     * 根据用户名获取用户信息，包括从库的地址信息
     *
     * @param userName
     * @return
     */
    User findUserByName(String userName);
}
