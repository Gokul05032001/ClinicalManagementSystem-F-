package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.ILabTestPrescribedRepository;
import com.faith.app.dto.LabTestPrescribedtDTO;

import com.faith.app.entity.LabTestPrescribed;

@Service
public class LabTestPrescribedServiceImplement implements ILabTestPrescribedService {
	
	@Autowired
	private ILabTestPrescribedRepository labTestPrescribedRepository;

	@Override
	public void saveLabTestPrescribed(LabTestPrescribed labTestPrescribed) {
		 System.out.println("In service...");
		labTestPrescribedRepository.save(labTestPrescribed);
	}

	
	
	@Override
	public List<LabTestPrescribedtDTO> getAllLabTestPrescribedByPatientId(int id) {
		 
		return (List<LabTestPrescribedtDTO>)labTestPrescribedRepository.getAllDTOLabTestPrescriptionsByPatientId(id);
	}



	@Override
	public List<LabTestPrescribed> getLabTestsPrescribed() {
		 
		 return (List<LabTestPrescribed>)labTestPrescribedRepository.findAll();
	}



	@Override
	public Optional<LabTestPrescribed> getLabTestPrescribed(int theId) {
		 
		return labTestPrescribedRepository.findById(theId);
	}



	@Override
	public void deleteLabTestPrescribed(int theId) {
		labTestPrescribedRepository.deleteById(theId);
		
	}
	




}
