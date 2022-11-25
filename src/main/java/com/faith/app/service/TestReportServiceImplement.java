package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.ITestReportRepository;
import com.faith.app.dto.NotesPrescribedDTO;
import com.faith.app.dto.TestResultDTO;
import com.faith.app.entity.TestReport;
@Service
public class TestReportServiceImplement implements ITestReportService {
	
	
	@Autowired
	private ITestReportRepository testReportRepository  ;

	@Override
	public void saveTestReport(TestReport testReport) {
		 
		testReportRepository.save(testReport);
	}

	@Override
	public List<TestResultDTO> getAllTestResultByPatientId(int id) {
		
		return (List<TestResultDTO>) testReportRepository.getAllDTOTestResultByPatientId(id);
	}

}
