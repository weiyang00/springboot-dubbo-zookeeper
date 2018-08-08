package com.example.springbootdemo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.springbootdemo.dao.cluster.CityDao;
import com.example.springbootdemo.domain.City;
import com.example.springbootdemo.domain.User;
import com.example.springbootdemo.domain.UserAndCity;
import com.example.springbootdemo.service.CityDubboService;
import com.example.springbootdemo.service.CityService;
import com.example.springbootdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 城市业务逻辑实现类
 * <p>
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CityServiceImpl.class);

    @Reference(version = "1.0.0")
    UserService userService;
    @Autowired
    CityDao cityDao;

    @Override
    public UserAndCity findCityById() {
        City city = null;
//        User user = userService.findUserByName("泥瓦匠");
        User user = new User();

        UserAndCity userAndCity = new UserAndCity();
        long id = 1L;

        List<City> cities = cityDao.selectAll();

        city = cityDao.selectByPrimaryKey(1L);

        System.out.println("共有多少城市 === "+ cities.size());

        userAndCity.setCity(city);
        userAndCity.setUser(user);

        return userAndCity;
    }
}
