package com.genie.meerkat.controller;

import org.junit.Test;

import com.genie.meerkat.vo.Role;
import com.genie.meerkat.vo.User;
import static org.junit.Assert.*;

public class UserControllerTest {

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
		User failUser = new User(null,USER_NAME, PHONE_NUMBER, E_ROLE);
		
		UserController userController = new UserController();
		
		assertEquals("OK", userController.addUser(successUser));
		
		assertEquals("FAIL", userController.addUser(failUser));
		
	}
}
