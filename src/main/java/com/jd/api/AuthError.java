package com.jd.api;

import org.springframework.stereotype.Service;

@Service
public class AuthError implements AuthService {

	@Override
	public String auth(String name, String password) {
		return "鉴权失败";
	}

	@Override
	public String auth(String refreshToken) {
		return  "鉴权失败";
	}

}
