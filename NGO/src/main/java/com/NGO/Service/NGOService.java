package com.NGO.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.NGO.Entity.NGO;
import com.NGO.Entity.User;
import com.NGO.Repository.NGORepository;

@Service
public class NGOService {
	@Autowired
	private NGORepository Ngorepository;
	@Autowired
	private RestTemplate restTemplate;

	public NGO addNgo(NGO ngo) {
		// TODO Auto-generated method stub
		return Ngorepository.save(ngo);
	}

	public List<NGO> getAllNGO() {
		// TODO Auto-generated method stub
		return Ngorepository.findAll();
	}

	public Optional<NGO> GetNgoById(int id) {
		// TODO Auto-generated method stub
		return Ngorepository.findById(id);
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
	 List ur= restTemplate.getForObject("http://localhost:8082/getuser", List.class);
	return ur;
	}

	public NGO fetchNGOByNGOusername(String username, String password) {
		// TODO Auto-generated method stub
		return Ngorepository.findByUsernameAndPassword(username,password);
	}
	

}
