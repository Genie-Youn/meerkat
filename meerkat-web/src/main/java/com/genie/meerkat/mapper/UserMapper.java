package com.genie.meerkat.mapper;

import java.util.List;

import com.genie.meerkat.vo.User;

public class UserMapper extends AbstractMapper {
	
	public Object insertUser(User user) {
		return insert("User.insertUser", user);
	}
	
	public Object deleteUser(String userId) {
		return delete("User.delete", userId);
	}
	
	public User selectUser(String userId) {
		return (User) selectOne("User.selectOne", userId);
	}
	
	public List<User> selectUserList() {
		return selectList("User.selectAll");
	}

}
