package com.Medicine.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Medicine.Entity.Medicine;
import com.Medicine.Service.MedicineService;
@RestController
public class MedicineController {
	@Autowired
	private MedicineService medicineservice;
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/addMedicine")
	public Medicine addmed(@RequestBody Medicine med) {
		return medicineservice.addmed(med);
	}
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/getAllmedicine")
	public List<Medicine> getAllMedicine(){
		return medicineservice.getAllMedicine();
		
	}
	@GetMapping("/getMedicine/{id}")
	public Optional <Medicine > findById(@PathVariable int id) {
		return medicineservice.findById(id);
	}
	

}
