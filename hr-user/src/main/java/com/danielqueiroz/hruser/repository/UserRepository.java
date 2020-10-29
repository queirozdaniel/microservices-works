package com.danielqueiroz.hruser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielqueiroz.hruser.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}
