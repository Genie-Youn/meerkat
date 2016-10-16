package com.genie.meerkat.mapper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.genie.meerkat.vo.Role;
import com.genie.meerkat.vo.User;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")
public class UserMapperTest {

	private Logger LOG = LoggerFactory.getLogger(UserMapperTest.class);
	
	@Autowired
	private UserMapper mapper;
	
	private final static String USER_ID = "'2016061075'";
	private final static String USER_NAME = "'윤지수'";
	private final static String PHONE_NUMBER = "'010-1234-5678'";
	private final static String ROLE = "ADMIN";
	private final static Role E_ROLE = Role.ADMIN;
	
	private User successUser;
	private User failUser;
	
	@Before
	public void setUp() {
		this.successUser = new User(USER_ID, USER_NAME, PHONE_NUMBER, E_ROLE);
		this.failUser = new User(null, USER_NAME, PHONE_NUMBER, E_ROLE);
	}
	
	@Test
	public void userSelectAndInsertAndDeleteTest() {

		int count;
		
		if (mapper.selectUserList() != null) {
			count = mapper.selectUserList().size();
		} else {
			count = 0;
		}
		
		mapper.insertUser(successUser);
		assertTrue(count < mapper.selectUserList().size());
		
		mapper.deleteUser(successUser);
		if (mapper.selectUserList() != null) {
			assertTrue(count == mapper.selectUserList().size());
		} else {
			assertTrue(count == 0);
		}
	}
	
	@Test(expected=Exception.class)
	public void unValidUserInsertTest() {
		mapper.insertUser(failUser);
	}
}
