package com.genie.meerkat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.genie.meerkat.mapper.UserMapper;
import com.genie.meerkat.vo.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public Boolean addUser(User user) {
		
		if (userMapper.insertUser(user).equals(1)){
			return true;
		}
		return  false;
	}

	@Override
	public Boolean removeUser(String userId) {
		User user = new User(userId, null, null, null);
		if (userMapper.deleteUser(user).equals(1)) {
			return true;
		}
		return false;
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		User user = new User(userId, null, null, null);
		return userMapper.selectUser(user);
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

}
