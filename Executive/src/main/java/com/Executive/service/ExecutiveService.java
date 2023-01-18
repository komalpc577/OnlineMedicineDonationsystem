package com.Executive.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Executive.Repository.ExecutiveRepository;
import com.Executive.entity.Executive;
@Service
public class ExecutiveService  {
	@Autowired
	private  ExecutiveRepository executiverepo;
	public Executive fetchExecutiveByExecutivename(String username, String password) {
		// TODO Auto-generated method stub
		return executiverepo.findByUsernameAndPassword(username, password);
	}
	
	

}