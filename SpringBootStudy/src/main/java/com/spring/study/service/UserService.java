package com.spring.study.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.study.dao.UserDAO;

@Service("userService")
public class UserService {
	@Autowired
	UserDAO userDAO;
	
	public List<Map<String, Object>> userName(){
		List<Map<String, Object>> test = userDAO.getUserName();
		return userDAO.getUserName();
	}
}
