package com.faith.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.dto.MedicinePrescribedDTO;
import com.faith.app.entity.MedicinePrescribed;
@Repository
public interface IMedicinePrescribedRepository extends CrudRepository<MedicinePrescribed, Integer> {
	
	
	@Query("SELECT new com.faith.app.dto.MedicinePrescribedDTO (a.patientId, p.fullName,m.medicineName, m.genericName,"
			+ "mp.dosage, mp.course,mp.medprescribeId,mp.createdDate)"
			+ "FROM MedicinePrescribed mp "
			+ "INNER JOIN mp.medicine m " 
			+ "INNER JOIN mp.appointment a " 
			+ "INNER JOIN a.patient p " 
			+ "WHERE p.patientId =:id")
	public List<MedicinePrescribedDTO> getAllDTOMedicinePrescribedByPatientId(int id);

}
