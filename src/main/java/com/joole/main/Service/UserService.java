package com.joole.main.Service;

import org.springframework.stereotype.Service;

import com.joole.main.Entity.User;
@Service
public interface UserService {
	User getUserByUsername(String username);
    User getUserByCredentials(String username, String password);
    User createUser(User user);
}
