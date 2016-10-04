package com.genie.meerkat.vo;

/**
 * @author bonos2
 *
 */
public class User {
	
	private String number;
	private String userId;
	private String name;
	private String phoneNumber;
	private Role role;
	
	public User(String userId, String name, String phoneNumber, Role role){
		this.userId = userId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "User [number=" + number + ", userId=" + userId + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", role=" + role + "]";
	}

}
