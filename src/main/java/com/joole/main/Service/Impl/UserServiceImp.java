package com.joole.main.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.joole.main.DAO.UserDAO;
import com.joole.main.Entity.User;
import com.joole.main.Service.UserService;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserDAO userDao;
	
	@Autowired
    private PasswordEncoder bcryptEncoder;
	
	@Override
	public User getUserByUsername(String username) {
		return userDao.findByUsername(username);
	}
	
	@Override
	public User getUserByCredentials(String username, String password) {
		User user = userDao.findByUsername(username);
		
		if(user != null && bcryptEncoder.matches(password, user.getPassword())) {
			return user;
		}
		
		return null;
	}

	@Override
	public User createUser(User user) {
		
		//First check if username already exists
		User createUser = userDao.findByUsername(user.getUsername());
		if(createUser != null) {
			//User already exists
			System.out.println("User with username " + user.getUsername()
					+ " already exists.");
			return null;
		}
		
		User createdUser = userDao.saveAndFlush(user);
		System.out.println("User created successfully!");
		return createdUser;
	}

}
