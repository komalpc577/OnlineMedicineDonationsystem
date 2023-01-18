package com.adminservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.adminservice.entity.Admin;
import com.adminservice.entity.Medicine;
import com.adminservice.entity.NGO;
import com.adminservice.entity.User;
import com.adminservice.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
    private AdminService adminservice;

	@CrossOrigin("http://localhost:4200/")
    @PostMapping("/addAdmin")
    public Admin adminlogin(@RequestBody Admin admin) {
        return adminservice.adminlogin(admin);
    }
	@CrossOrigin("http://localhost:4200/")
	@PostMapping("/adminLogin")
	public Admin loginadmin(@RequestBody Admin admin) throws Exception
	{
		String username=admin.getUsername();
		String password=admin.getPassword();
		Admin exeObj=null;
		if(username!=null&& password!=null)
		{
			exeObj=adminservice.fetchAdminByAdminusername(username, password);
		}
		
		if(exeObj==null)
		{
			throw new Exception("Bad credentials");
		}
		return exeObj;
	}
    @GetMapping("/user/{id}")
    public String getuserbyId(@PathVariable int userid) {
        return adminservice.getUserById(userid);
    }
    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/alluser")
    public List<User> getallusers(){
        return adminservice.getallusers();
    }
    @GetMapping("/allNgo")
    public List<NGO> getAllngo(){
        return adminservice.getAllngo();
    }
    @CrossOrigin("http://localhost:4200/")
    @PostMapping("/addNgo")
    public NGO addNgo(@RequestBody NGO ngo) {
        return adminservice.addNgo(ngo);
    }
//9005/admin/addNgo
    @PostMapping("/addMedicine")
    public Medicine addmedicine(@RequestBody Medicine medicine) {
        return adminservice.addmedicine(medicine);
    }

 

}
