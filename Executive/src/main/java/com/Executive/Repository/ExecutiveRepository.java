package com.Executive.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Executive.entity.Executive;

@Repository
public interface ExecutiveRepository extends JpaRepository<Executive,Integer>{

	public Executive findByUsernameAndPassword(String username,String password);

}
