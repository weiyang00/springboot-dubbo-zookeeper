package com.example.springbootdemo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.springbootdemo.domain.City;
import com.example.springbootdemo.domain.UserAndCity;
import com.example.springbootdemo.service.CityDubboService;
import com.example.springbootdemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;


    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public UserAndCity findOneCity(@RequestParam(value = "name", required = true)  String name) {
        return cityService.findCityById(name);
    }



}
