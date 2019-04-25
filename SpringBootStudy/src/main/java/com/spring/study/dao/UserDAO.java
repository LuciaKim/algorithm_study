package com.spring.study.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {
	public List<Map<String, Object>> getUserName();
}
