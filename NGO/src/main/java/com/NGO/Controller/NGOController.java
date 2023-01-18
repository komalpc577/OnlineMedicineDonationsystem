package com.NGO.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.NGO.Entity.NGO;
import com.NGO.Entity.User;
import com.NGO.Service.NGOService;


@RestController
public class NGOController {
	@Autowired
	private NGOService Ngoservice;
	
	@CrossOrigin("http://localhost:4200/")
	@PostMapping("/addNgo")
	public NGO addNgo(@RequestBody NGO ngo) {
		return Ngoservice.addNgo(ngo);
	}
	
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/getNgo")
	public List<NGO> getAllNGO(){
		return Ngoservice.getAllNGO();
		
	}
	@GetMapping("/getNgo/{id}")
	public Optional<NGO> GetNgoById(@PathVariable int id){
		return Ngoservice.GetNgoById(id);
	}
	@GetMapping("/getusers")
	public List<User> getAllUser(){
		return Ngoservice.getAllUser();
	}
	
	@CrossOrigin("http://localhost:4200/")
	@PostMapping("/NgoLogin")
	public NGO loginngo(@RequestBody NGO ngo) throws Exception
	{
		String username=ngo.getUsername();
		String password=ngo.getPassword();
		NGO exeObj=null;
		if(username!=null&& password!=null)
		{
			exeObj=Ngoservice.fetchNGOByNGOusername(username, password);
		}
		
		if(exeObj==null)
		{
			throw new Exception("Bad credentials");
		}
		else {
		System.out.println("successfully");
		}
		return exeObj;
		
	}
}
