package com.genie.meerkat.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.genie.meerkat.vo.User;

@Repository("userMapper")
public class UserMapper extends AbstractMapper {
	
	public Object insertUser(User user) {
		return insert("User.insertUser", user);
	}
	
	public Object deleteUser(User user) {
		return delete("User.delete", user);
	}
	
	public User selectUser(User user) {
		return (User) selectOne("User.selectOne", user);
	}
	
	public List<User> selectUserList() {
		return (List<User>)selectList("User.selectAll");
	}

}
