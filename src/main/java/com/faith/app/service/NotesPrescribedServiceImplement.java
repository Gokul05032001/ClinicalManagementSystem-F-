package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IMedicineRepository;
import com.faith.app.dao.INotesPrescribedRepository;
import com.faith.app.dto.MedicinePrescribedDTO;
import com.faith.app.dto.NotesPrescribedDTO;
import com.faith.app.entity.LabTestPrescribed;
import com.faith.app.entity.Prescriptionnotes;
@Service
public class NotesPrescribedServiceImplement implements INotesPrescribedService {
	
	@Autowired
	private INotesPrescribedRepository notesPrescribedRepository ;

	@Override
	public void saveNotesPrescribed(Prescriptionnotes prescriptionnotes) {
		 
		notesPrescribedRepository.save(prescriptionnotes);
	}

	@Override
	public List<NotesPrescribedDTO> getAllNotesPrescribedByPatientId(int id) {
		
		return (List<NotesPrescribedDTO>) notesPrescribedRepository.getAllDTONotesPrescribedByPatientId(id);
	}

	@Override
	public List<Prescriptionnotes> getAllPrescriptionnotes() {
		
		 return (List<Prescriptionnotes>)notesPrescribedRepository.findAll();
	}

	@Override
	public Optional<Prescriptionnotes> getPrescriptionnote(int theId) {
		 
		return notesPrescribedRepository.findById(theId);
	}

	@Override
	public void deletePrescriptionnotes(int theId) {
		notesPrescribedRepository.deleteById(theId);
		
	}

}
