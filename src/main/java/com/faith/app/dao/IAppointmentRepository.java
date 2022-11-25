package com.faith.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.dto.AppointmentDTO;
import com.faith.app.entity.Appointment;

@Repository
public interface IAppointmentRepository extends CrudRepository<Appointment, Integer> {
	
	
	
	
	
	
	@Query("SELECT new com.faith.app.dto.AppointmentDTO(a.appoinId,a.patientId,a.tokenNum,"
			+ "a.docId,p.fullName,a.doa,a.createdDate)"
			+ "FROM Appointment a INNER JOIN a.patient p ORDER BY a.appoinId")
			public List<AppointmentDTO> getAllDTOAppointmentDetails();

}
