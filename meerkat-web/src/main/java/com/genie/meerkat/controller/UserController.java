package com.genie.meerkat.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.genie.meerkat.service.UserService;
import com.genie.meerkat.vo.User;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	private Logger LOG = LoggerFactory.getLogger(UserController.class);
	
//	@Autowired
//	private UserService userService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String addUser(@RequestBody User user) {
		
		
		
		return null;
	}
}
