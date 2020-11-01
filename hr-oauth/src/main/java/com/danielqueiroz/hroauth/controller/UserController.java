package com.danielqueiroz.hroauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.danielqueiroz.hroauth.model.User;
import com.danielqueiroz.hroauth.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email){
		
		try {
			User user = (User) userService.loadUserByUsername(email);
			return ResponseEntity.ok(user);
			
		} catch (UsernameNotFoundException e ) {
			return ResponseEntity.notFound().build();
		}
		
	}
	
}
