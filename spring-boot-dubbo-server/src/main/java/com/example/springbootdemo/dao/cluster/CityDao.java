package com.example.springbootdemo.dao.cluster;

import com.example.springbootdemo.tk.TplDataService;
import com.example.springbootdemo.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;



@Mapper
public interface CityDao extends TplDataService<City> {


    City findByName(@Param("cityName") String cityName);

    @Select("SELECT * FROM city WHERE id = #{id}")
    City findById(@Param("id") Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);

}
