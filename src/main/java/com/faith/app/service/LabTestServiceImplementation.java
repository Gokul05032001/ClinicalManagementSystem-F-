package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IAppointmentRepository;
import com.faith.app.dao.ILabTestRepository;
import com.faith.app.entity.Appointment;
import com.faith.app.entity.LabTest;
@Service
public class LabTestServiceImplementation implements ILabTestService {
	
	@Autowired
	private ILabTestRepository labTestRepository ;

	@Override
	public List<LabTest> getLabTests() {
		 
		return (List<LabTest>) labTestRepository.findAll();
	}

}
