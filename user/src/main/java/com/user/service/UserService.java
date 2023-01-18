package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.user.entity.User;
import com.user.repository.Userrepository;

@Service
public class UserService {

	@Autowired
	private Userrepository userRepo;
	//@Autowired
	//private MedicineRepository medicinerepository;
	
	
	//save user data
	public User saveUser(User user){
		return userRepo.save(user);
	}
	
	//User is already exist or not
	public User fetchUserByUsername(String username)
	{
		return userRepo.findByUsername(username);
	}
	
	
	public User fetchUserByUsername(String username,String password)
	{
		return userRepo.findByUsernameAndPassword(username, password);
	}

//	public List<Medicine> getAllMedicine() {
//		// TODO Auto-generated method stub
//		return medicinerepository.findAll();
//	}

	public Optional<User> userById(int id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id);
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
	
}
