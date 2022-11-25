package com.faith.app.service;

import java.util.List;

import com.faith.app.dto.TestResultDTO;
import com.faith.app.entity.TestReport;

public interface ITestReportService {
	
	public void saveTestReport(TestReport testReport);
	
	//Find all lab results prescriptions by Id
	public List<TestResultDTO>  getAllTestResultByPatientId(int id);

}
