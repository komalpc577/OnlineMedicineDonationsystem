package com.NGO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NGO.Entity.NGO;

@Repository
public interface NGORepository extends JpaRepository<NGO,Integer> {

	public NGO findByUsernameAndPassword(String username, String password);
	

}
