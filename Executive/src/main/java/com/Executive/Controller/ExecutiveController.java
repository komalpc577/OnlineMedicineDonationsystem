package com.Executive.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Executive.entity.Executive;
import com.Executive.service.ExecutiveService;

@RestController
public class ExecutiveController {
	
	@Autowired
	private ExecutiveService executiveservice;
	@CrossOrigin(origins = "http://localhost:4200/")
	@PostMapping("/executiveLogin")
	public Executive loginexecutive(@RequestBody Executive executive) throws Exception
	{
		String username=executive.getUsername();
		String password=executive.getPassword();
		Executive exeObj=null;
		if(username!=null&& password!=null)
		{
			exeObj=executiveservice.fetchExecutiveByExecutivename(username, password);
		}
		
		if(exeObj==null)
		{
			throw new Exception("Bad credentials");
		}
		return exeObj;

}
		
	}


