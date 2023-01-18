package com.adminservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adminservice.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {

	
	Admin findByUsernameAndPassword(String username, String password);
;
}
