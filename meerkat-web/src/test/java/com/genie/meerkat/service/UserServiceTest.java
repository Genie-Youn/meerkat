package com.genie.meerkat.service;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.genie.meerkat.controller.UserController;
import com.genie.meerkat.vo.Role;
import com.genie.meerkat.vo.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")
public class UserServiceTest {
	
	@Autowired
	UserService userService;

	private final static String USER_ID = "'2016061075'";
	private final static String USER_NAME = "'윤지수'";
	private final static String PHONE_NUMBER = "'010-1234-5678'";
	private final static String ROLE = "ADMIN";
	private final static Role E_ROLE = Role.ADMIN;
	
	private User successUser;
	private User failUser;

	@Test
	public void addAndGetUserTest() {

		this.successUser = new User(USER_ID, USER_NAME, PHONE_NUMBER, E_ROLE);
		this.failUser = new User(null, USER_NAME, PHONE_NUMBER, E_ROLE);
		
		userService.removeUser(USER_ID);
		userService.addUser(successUser);
		
		User user = userService.getUser(USER_ID);
		
		assertThat("'"+user.getUserId()+"'", is(successUser.getUserId()));
		assertThat("'"+user.getName()+"'", is(successUser.getName()));
		assertThat("'"+user.getPhoneNumber()+"'", is(successUser.getPhoneNumber()));
		
		userService.removeUser(USER_ID);
	}
}
