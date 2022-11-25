package com.faith.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.dto.TestResultDTO;
import com.faith.app.entity.TestReport;
@Repository
public interface ITestReportRepository extends CrudRepository<TestReport, Integer> {
	
	
	@Query("SELECT new com.faith.app.dto.TestResultDTO (a.patientId, p.fullName,t.testCode, t.testName,"
			+ "l.labtestprescribeId, r.observedvalue, a.appoinId, r.createdDate)"
			+ "FROM TestReport r "
			+ "INNER JOIN r.labTest t " 
			+ "INNER JOIN r.labTestPrescribed l " 
			+ "INNER JOIN r.appointment a " 
			+ "INNER JOIN a.patient p " 
			+ "WHERE p.patientId =:id")
	public List<TestResultDTO> getAllDTOTestResultByPatientId(int id);

}
