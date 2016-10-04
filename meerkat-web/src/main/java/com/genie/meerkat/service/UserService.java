package com.genie.meerkat.service;

import java.util.List;

import com.genie.meerkat.vo.User;

public interface UserService {
	
	Boolean addUser(User user);
	
	Boolean removeUser(String userId);
	
	User getUser(String userId);
	
	List<User> getUserList();
}
