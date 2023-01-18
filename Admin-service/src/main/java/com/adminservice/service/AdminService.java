package com.adminservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.adminservice.entity.Admin;
import com.adminservice.entity.Medicine;
import com.adminservice.entity.NGO;
import com.adminservice.entity.User;
import com.adminservice.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
    private AdminRepository adminrepository;
    @Autowired
    private RestTemplate restTemplate;
    public Admin adminlogin(Admin admin) {
        return adminrepository.save(admin);
    }

    public String getUserById(int userid) {
        User u=restTemplate.getForObject("http://localhost:8082/user/"+userid, User.class);
        return u.toString();
    }

        public List<User> getallusers(){
            List pr= restTemplate.getForObject("http://localhost:8082/getuser", List.class);
            return pr;
        }

 

        public List<NGO> getAllngo() {
            // TODO Auto-generated method stub
            List ng=restTemplate.getForObject("http://localhost:9007/getNgo", List.class);
            return ng;
        }

 

        public NGO addNgo(NGO ngo) {
            // TODO Auto-generated method stub
            NGO n=restTemplate.postForObject("http://localhost:9007/addNgo", ngo, NGO.class);
            return n;
        }

 

        public Medicine addmedicine(Medicine medicine) {
            // TODO Auto-generated method stub
            Medicine m=restTemplate.postForObject("http://localhost:8089/addMedicine", medicine, Medicine.class);
            return m;
        }

//        public Admin fetchAdminByAdminusername(String username, String password) {
//    		// TODO Auto-generated method stub
//    		return adminrepository.findByUsernameAndPassword(username, password);
//    	}

		public Admin fetchAdminByAdminusername(String username, String password) {
			// TODO Auto-generated method stub
			return adminrepository.findByUsernameAndPassword(username, password);
		}
    	
}
