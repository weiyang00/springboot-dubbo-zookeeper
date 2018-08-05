package com.example.springbootdemo.service;


import com.example.springbootdemo.domain.City;

/**
 * Created by weiyang on 2018/8/5.
 *
 * @Author: weiyang
 * @Package com.example.springbootdemo.service
 * @Project: spring-boot-dubbo-server
 * @Title:
 * @Description: Please fill description of the file here
 * @Date: 2018/8/5 11:42
 */
public interface CityDubboService {

    City findCityByName(String cityName);
}
