package com.joole.main.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.json.*;

import com.joole.main.Config.JwtTokenUtil;
import com.joole.main.Entity.User;
import com.joole.main.Model.JwtRequest;
import com.joole.main.Service.JwtUserDetailsService;
import com.joole.main.Service.UserService;

@RestController
@RequestMapping("user")
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
    private PasswordEncoder bcryptEncoder;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	@Autowired
	private JwtUserDetailsService userDetailsService;
	
	@PostMapping("createUser")
	public Boolean createUser(@RequestBody String json) {
		/*
		 * Accepts a JSON formatted string with the parameters to create a user.
		 * Returns a true if the user is created, otherwise returns false.
		 * Will return false if a user with the given username already exists.
		 */
		JSONObject jsonObj = new JSONObject(json);
		String username = jsonObj.getString("username");
		String password = jsonObj.getString("password");
		String firstName = jsonObj.getString("firstName");
		String lastName = jsonObj.getString("lastName");
		
		//Hash the password with bcrypt
		String hashedPassword = bcryptEncoder.encode(password);
		User user = new User(username, hashedPassword, firstName, lastName);
		User created = userService.createUser(user);
		return (created != null) ? true : false;
	}
	
	@PostMapping("login")
	public String login(@RequestBody JwtRequest jwtReq) {
		/*
		 * Accepts a string username and password, and returns a temporary
		 * JWT authentication token as a string
		 */
		User user = userService.getUserByCredentials(jwtReq.getUsername(), jwtReq.getPassword());
		
		if(user == null) {
			return "failed";
		}
		else {
			final UserDetails userDetails = userDetailsService
					.loadUserByUsername(jwtReq.getUsername());
			final String token = jwtTokenUtil.generateToken(userDetails);
			
			JSONObject json = new JSONObject();
			json.put("userId", user.getUserId());
			json.put("username", user.getUsername());
			json.put("firstName", user.getFirstName());
			json.put("lastName", user.getLastName());
			json.put("token", token);
			
			return json.toString();
		}
	}
	@GetMapping("getUser")
	public User getUser(@RequestHeader("Authorization") String auth) {
		
		//find user from the token
		if(auth.startsWith("Bearer ")) {
			String jwtToken = auth.substring(7);
			
			String username = jwtTokenUtil.getUsernameFromToken(jwtToken);
			return userService.getUserByUsername(username);
		}
		return null;
	}
}
