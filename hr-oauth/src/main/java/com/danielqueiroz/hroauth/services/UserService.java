package com.danielqueiroz.hroauth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.danielqueiroz.hroauth.feignclients.UserFeignClient;
import com.danielqueiroz.hroauth.model.User;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserFeignClient userFeignClient;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userFeignClient.findByEmail(username).getBody();

		if (user == null) {
			throw new UsernameNotFoundException("Email não encontrado");
		}

		return user;
	}

}
