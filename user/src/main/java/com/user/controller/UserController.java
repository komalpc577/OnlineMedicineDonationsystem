package com.user.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.user.entity.User;
import com.user.service.UserService;

@RestController
//@RequestMapping("/user")
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/register")
	public User saveUser(@RequestBody User user){
		System.out.println("Register");
		return userservice.saveUser(user);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception
	{
		String username=user.getUsername();
		String password=user.getPassword();
		User userObj=null;
		if(username!=null&& password!=null)
		{
			userObj=userservice.fetchUserByUsername(username, password);
		}
		
		if(userObj==null)
		{
			throw new Exception("Bad credentials");
		}
		return userObj;
		
	}
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/getuser")
	public List<User> getAllUser(){
		return userservice.getAllUser();
	}
	
	@GetMapping("/user/{id}")
	public User userById(@PathVariable int userid){
		System.out.println("user url /user/" +userid);
		return userservice.userById(userid).get();
	}
	
//	@GetMapping("/getMedicine")
//	public List<Medicine> getAllMedicine(){
//		return userservice.getAllMedicine();
//	}

}
