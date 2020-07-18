package com.baharuddinfamily.springbootsecurityrolebasedauthorization.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;

import com.baharuddinfamily.springbootsecurityrolebasedauthorization.model.User;
import com.baharuddinfamily.springbootsecurityrolebasedauthorization.repos.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRepository.getUserByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException("Could not find user");
		}

		return new MyUserDetails(user);
	}

}