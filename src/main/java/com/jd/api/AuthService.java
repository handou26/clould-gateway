package com.jd.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value="authService",fallback=AuthError.class)
public interface AuthService {
	
	 @RequestMapping(value = "/auth")
     public String auth(@RequestParam("userName") String name,@RequestParam("password") String password);
	 
	 
	 @RequestMapping(value = "/token/refresh")
     public String auth(@RequestParam("token") String refreshToken);


}

