package com.example.springbootdemo.dao.cluster;

import com.example.springbootdemo.tk.TplDataService;
import com.example.springbootdemo.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


/**
 * 城市 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */
@Mapper
public interface CityDao extends TplDataService<City> {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */

    City findByName(@Param("cityName") String cityName);

    @Select("SELECT * FROM city WHERE id = #{id}")
    City findById(@Param("id") Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);

}
