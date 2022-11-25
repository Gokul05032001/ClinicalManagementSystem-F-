package com.faith.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.dto.NotesPrescribedDTO;
import com.faith.app.entity.Prescriptionnotes;
@Repository
public interface INotesPrescribedRepository extends CrudRepository<Prescriptionnotes, Integer> {
	
	
	@Query("SELECT new com.faith.app.dto.NotesPrescribedDTO (a.patientId, p.fullName,"
			+ "pn.notesId, pn.notes, pn.createdDate)"
			+ "FROM Prescriptionnotes pn "
			+ "INNER JOIN pn.appointment a " 
			+ "INNER JOIN a.patient p " 
			+ "WHERE p.patientId =:id")
	public List<NotesPrescribedDTO> getAllDTONotesPrescribedByPatientId(int id);

}
