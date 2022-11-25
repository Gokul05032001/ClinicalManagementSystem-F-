package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.dto.LabTestPrescribedtDTO;

import com.faith.app.entity.LabTestPrescribed;

public interface ILabTestPrescribedService {
	
	//List
	public List<LabTestPrescribed> getLabTestsPrescribed();
	//Insert/Update
	//save
	public void saveLabTestPrescribed(LabTestPrescribed labTestPrescribed);
	
	//Search By Id
	public Optional<LabTestPrescribed> getLabTestPrescribed(int theId);
	
	
	
	//Delete
	public void deleteLabTestPrescribed(int theId);
	
	
	
	//Delete by Patient ID
	//public void deleteLabTestPrescribedByPatientId(int theId);
	
	//Find all lab test prescriptions by Id
	public List<LabTestPrescribedtDTO>  getAllLabTestPrescribedByPatientId(int id);
	
	
	

}
