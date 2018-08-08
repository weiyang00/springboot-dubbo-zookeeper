package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.domain.City;
import com.example.springbootdemo.service.CityDubboService;
import com.alibaba.dubbo.config.annotation.Service;


/**
 * Created by weiyang on 2018/8/5.
 *
 * @Author: weiyang
 * @Package com.example.springbootdemo.service.impl
 * @Project: spring-boot-dubbo-server
 * @Title:
 * @Description: Please fill description of the file here
 * @Date: 2018/8/5 11:42
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {


    public City findDubboCityByName(String cityName) {
        return new City(1L,2L,cityName,"是我的故乡", null, null);
    }
}