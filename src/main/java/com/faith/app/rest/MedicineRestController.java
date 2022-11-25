package com.faith.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Medicine;
import com.faith.app.service.IMedicineService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class MedicineRestController {
	
	
	@Autowired
	private IMedicineService  medicineService;
	
	//Get all Employees
			@GetMapping("/medicines")
			public List<Medicine> getAllMedicines(){
				
				return medicineService.getMedicines();
				
			}

}
