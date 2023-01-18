package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.User;

@Repository
public interface Userrepository  extends JpaRepository<User,Integer>{

	public User findByUsername(String username);
	public User findByUsernameAndPassword(String username,String password);

}
