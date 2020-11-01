package com.danielqueiroz.hroauth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielqueiroz.hroauth.feignclients.UserFeignClient;
import com.danielqueiroz.hroauth.model.User;

@Service
public class UserService {

	@Autowired
	private UserFeignClient userFeignClient;
	
	
	public User findByEmail(String email) {
		User user = userFeignClient.findByEmail(email).getBody();
		
		if (user == null) {
			throw new IllegalArgumentException("Email não encontrado");
		}
		
		return user;
	}
	
}
