package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.dto.MedicinePrescribedDTO;
import com.faith.app.entity.LabTestPrescribed;
import com.faith.app.entity.MedicinePrescribed;

public interface IMedicinePrescribedService {
	
	
		//List
		public List<MedicinePrescribed> getMedicinesPrescribed();
		
		//Search By Id
		public Optional<MedicinePrescribed> getMedicinePrescribed(int theId);
		
		//save
		public void saveMedicinePrescribed(MedicinePrescribed medicinePrescribed);
		
		//Delete
		public void deleteMedicinePrescribed(int theId);
		
		
		//Find all lab test prescriptions by Id
		public List<MedicinePrescribedDTO>  getAllMedicinePrescribedByPatientId(int id);

}
