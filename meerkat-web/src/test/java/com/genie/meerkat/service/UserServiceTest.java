package com.genie.meerkat.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.genie.meerkat.controller.UserController;
import com.genie.meerkat.vo.Role;
import com.genie.meerkat.vo.User;

public class UserServiceTest {

	private final static String USER_ID = "2016061075";
	private final static String USER_NAME = "윤지수";
	private final static String PHONE_NUMBER = "010-1234-5678";
	private final static String ROLE = "ADMIN";
	private final static Role E_ROLE = Role.ADMIN;

	@Test
	public void addUserTest() {

		String jsonParm = "{" + "\"userId\" : \"" + USER_ID + "\"," + "\"name\" : \"" + USER_NAME + "\","
				+ "\"phoneNumber\" : \"" + PHONE_NUMBER + "\"," + "\"role\" : \"" + ROLE + "\"" + "}";

		User successUser = new User(USER_ID, USER_NAME, PHONE_NUMBER, E_ROLE);
		User failUser = new User(null, USER_NAME, PHONE_NUMBER, E_ROLE);

		UserService userService = new UserServiceImpl();

		assertEquals("OK", userService.addUser(successUser));

		assertEquals("FAIL", userService.addUser(failUser));

	}
}
