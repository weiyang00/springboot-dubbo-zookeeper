package com.example.springbootdemo.tk;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface TplDataService<T> extends Mapper<T>, MySqlMapper<T> {
}