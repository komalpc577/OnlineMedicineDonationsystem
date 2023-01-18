package com.Medicine.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Medicine.Entity.Medicine;


@Repository
public interface MedicineRepository extends JpaRepository<Medicine,Integer> {

}
