package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.dto.NotesPrescribedDTO;
import com.faith.app.entity.MedicinePrescribed;
import com.faith.app.entity.Prescriptionnotes;

public interface INotesPrescribedService {
	
	
	//List
	public List<Prescriptionnotes> getAllPrescriptionnotes();
			
			//Search By Id
	public Optional<Prescriptionnotes> getPrescriptionnote(int theId);
			
	public void saveNotesPrescribed(Prescriptionnotes prescriptionnotes);
	
	public void deletePrescriptionnotes(int theId);
	
	//Find all lab notes prescriptions by Id
	public List<NotesPrescribedDTO>  getAllNotesPrescribedByPatientId(int id);

}
