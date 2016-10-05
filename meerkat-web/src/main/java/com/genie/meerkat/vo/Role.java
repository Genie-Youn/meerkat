package com.genie.meerkat.vo;

public enum Role {

	ADMIN(1),
	
	USER(2)
	;
	
	private int code;
	
	public int getCode() {
		return code;
	}

	Role(int code) {
		this.code = code;
	}
}
