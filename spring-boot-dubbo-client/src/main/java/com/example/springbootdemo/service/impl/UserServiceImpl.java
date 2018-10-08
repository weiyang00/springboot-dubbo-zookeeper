package com.example.springbootdemo.service.impl;


import com.alibaba.dubbo.config.annotation.Reference;
import com.example.springbootdemo.dao.master.UserDao;
import com.example.springbootdemo.domain.City;
import com.example.springbootdemo.domain.User;
import com.example.springbootdemo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务实现层
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao; // 主数据源

    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;

//    @Reference(version = "1.0.0")
//    AccountQueryFacade accountQueryFacade;

    @Override
    public User findUserByName(String userName) {


        User user = userDao.findByName(userName);
        City city = cityDubboService.findDubboCityByName("温江");
        System.out.println( "city ================ "+ city);
//        Account account = accountQueryFacade.getAccountByAccountNo("1");
//        System.out.println( "accountQueryFacade ================ "+ account);
        user.setCity(city);
        return user;
    }
}
