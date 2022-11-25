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

import com.faith.app.dto.NotesPrescribedDTO;
import com.faith.app.entity.MedicinePrescribed;
import com.faith.app.entity.Prescriptionnotes;
import com.faith.app.service.INotesPrescribedService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PrescriptionnotesRestController {
	
	@Autowired
	private INotesPrescribedService  notesPrescribedService;
	
	//Get all Employees
	@GetMapping("/notesprescribed")
	public List<Prescriptionnotes> getAllPrescriptionnotes(){
		
		return notesPrescribedService.getAllPrescriptionnotes();
		
	}
	
	//Get Employee By Id
	@GetMapping("/notesprescribed/{theId}")
	public Optional<Prescriptionnotes> getPrescriptionnote(@PathVariable int theId) {
		
		return notesPrescribedService.getPrescriptionnote(theId);
		
	}
	
	
	//Add Employee
	@PostMapping("/notesprescribed")
	public void addPrescriptionnotes(@RequestBody Prescriptionnotes prescriptionnotes) {
		notesPrescribedService.saveNotesPrescribed(prescriptionnotes);
	}
	
	
	
	//Update Employee
	@PutMapping("/notesprescribed")
	public void updatePrescriptionnotes(@RequestBody Prescriptionnotes prescriptionnotes) {
		notesPrescribedService.saveNotesPrescribed(prescriptionnotes);
		
	}
	
	//Delete Employee
	@DeleteMapping("/notesprescribed/{theId}")
	public void deletePrescriptionnotes(@PathVariable int theId) {
		notesPrescribedService.deletePrescriptionnotes(theId);
	}
	
	
	
	@GetMapping("/notesprescribed/dto/{id}")
	public List<NotesPrescribedDTO> getAllLabTestPrescribedByPatientId(@PathVariable int id){
		
		return notesPrescribedService.getAllNotesPrescribedByPatientId(id);
		
	}

	
	
}
