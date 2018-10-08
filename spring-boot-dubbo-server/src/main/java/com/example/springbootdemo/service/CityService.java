package com.example.springbootdemo.service;


import com.example.springbootdemo.domain.City;
import com.example.springbootdemo.domain.UserAndCity;

/**
 * 城市业务逻辑接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface CityService {
    /**
     * 根据城市 ID,查询城市信息
     *
     * @param id
     * @return
     */
    UserAndCity findCityById(String name);

}
