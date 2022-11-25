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

import com.faith.app.dto.LabTestPrescribedtDTO;
import com.faith.app.entity.LabTestPrescribed;
import com.faith.app.entity.Staff;
import com.faith.app.service.ILabTestPrescribedService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LabTestPrescribedRestController {
	
	@Autowired
	private ILabTestPrescribedService  labTestPrescribedService;
	
	//Get all Employees
		@GetMapping("/labtestsprescribed")
		public List<LabTestPrescribed> getAllLabTestsPrescribed(){
			System.out.println("getting...");
			return labTestPrescribedService.getLabTestsPrescribed();
			
		}
	
		
		//Get Employee By Id
		@GetMapping("/labtestsprescribed/{theId}")
		public Optional<LabTestPrescribed> getLabTestPrescribed(@PathVariable int theId) {
			
			return labTestPrescribedService.getLabTestPrescribed(theId);
			
		}
		
		//Add Employee
		@PostMapping("/labtestsprescribed")
		public void addLabTestPrescribed(@RequestBody LabTestPrescribed labTestPrescribed) {
			System.out.println("Inserting...");
			labTestPrescribedService.saveLabTestPrescribed(labTestPrescribed);
		}
		
		
		//Update Employee
		@PutMapping("/labtestsprescribed")
		public void updateLabTestPrescribed(@RequestBody LabTestPrescribed labTestPrescribed) {
			labTestPrescribedService.saveLabTestPrescribed(labTestPrescribed);
			
		}
		
		//Delete Employee
		@DeleteMapping("/labtestsprescribed/{theId}")
		public void deleteLabTestPrescribed(@PathVariable int theId) {
			labTestPrescribedService.deleteLabTestPrescribed(theId);
		}
		
		
	@GetMapping("/labtestsprescribed/dto/{id}")
	public List<LabTestPrescribedtDTO> getAllLabTestPrescribedByPatientId(@PathVariable int id){
		
		return labTestPrescribedService.getAllLabTestPrescribedByPatientId(id);
		
	}
	

}
