package com.faith.app.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.dto.MedicinePrescribedDTO;
import com.faith.app.entity.LabTestPrescribed;
import com.faith.app.entity.MedicinePrescribed;
import com.faith.app.service.IMedicinePrescribedService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class MedicinePrescribedRestController {
	
	@Autowired
	private IMedicinePrescribedService  medicinePrescribedService;
	
			//Get all Employees
			@GetMapping("/medicinesprescribed")
			public List<MedicinePrescribed> getAllMedicinesPrescribed(){
				
				return medicinePrescribedService.getMedicinesPrescribed();
				
			}
		
			
			//Get Employee By Id
			@GetMapping("/medicinesprescribed/{theId}")
			public Optional<MedicinePrescribed> getMedicinePrescribed(@PathVariable int theId) {
				
				return medicinePrescribedService.getMedicinePrescribed(theId);
				
			}
			
			//Add Employee
			@PostMapping("/medicinesprescribed")
			public void addMedicinePrescribed(@RequestBody MedicinePrescribed medicinePrescribed) {
				medicinePrescribedService.saveMedicinePrescribed(medicinePrescribed);
			}
			
			
			//Update Employee
			@PutMapping("/medicinesprescribed")
			public void updateMedicinePrescribed(@RequestBody MedicinePrescribed medicinePrescribed) {
				medicinePrescribedService.saveMedicinePrescribed(medicinePrescribed);
				
			}
			
			//Delete Employee
			@DeleteMapping("/medicinesprescribed/{theId}")
			public void deleteMedicinePrescribed(@PathVariable int theId) {
				medicinePrescribedService.deleteMedicinePrescribed(theId);
			}
			
			@GetMapping("/medicinesprescribed/dto/{id}")
			public List<MedicinePrescribedDTO> getAllLabTestPrescribedByPatientId(@PathVariable int id){
		
				return medicinePrescribedService.getAllMedicinePrescribedByPatientId(id);
		
			}

}
