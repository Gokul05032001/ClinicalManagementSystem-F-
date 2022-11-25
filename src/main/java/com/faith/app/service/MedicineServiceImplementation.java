package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 
import com.faith.app.dao.IMedicineRepository;

import com.faith.app.entity.Medicine;

@Service
public class MedicineServiceImplementation implements IMedicineService {
	
	@Autowired
	private IMedicineRepository medicineRepository ;

	 
	@Override
	public List<Medicine> getMedicines() {
		 
		return (List<Medicine>) medicineRepository.findAll();
	}

}
