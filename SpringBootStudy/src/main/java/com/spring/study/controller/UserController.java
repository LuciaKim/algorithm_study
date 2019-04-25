package com.spring.study.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.study.service.UserService;

@RestController
public class UserController {
	
	@Resource(name="userService")
	private UserService userService;
	
	@RequestMapping(value ="/getUser",method = RequestMethod.GET)
	public List<Map<String, Object>> userName() {
		return userService.userName();
	}
	
	@RequestMapping("/test")
	public void test() {
	}
}
