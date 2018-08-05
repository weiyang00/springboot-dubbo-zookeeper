package com.example.springbootdemo.service.impl;


import com.alibaba.dubbo.config.annotation.Reference;
import com.example.springbootdemo.dao.master.UserDao;
import com.example.springbootdemo.domain.City;
import com.example.springbootdemo.domain.User;
import com.example.springbootdemo.service.CityDubboService;
import com.example.springbootdemo.service.CityService;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务实现层
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
@com.alibaba.dubbo.config.annotation.Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao; // 主数据源

    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;

    @Override
    public User findUserByName(String userName) {
        User user = userDao.findByName(userName);
        City city = cityDubboService.findDubboCityByName("温江");
        user.setCity(city);
        return user;
    }
}
