package com.Medicine.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Medicine.Entity.Medicine;
import com.Medicine.Repository.MedicineRepository;
@Service
public class MedicineService {
	@Autowired
	private MedicineRepository medicinerepo;
	

	public List<Medicine> getAllMedicine(){
		return medicinerepo.findAll();
	}


	public Optional<Medicine> findById(int id) {
		// TODO Auto-generated method stub
		return medicinerepo.findById(id);
	}


	public Medicine addmed(Medicine med) {
		// TODO Auto-generated method stub
		return medicinerepo.save(med);
	}
	
	

}