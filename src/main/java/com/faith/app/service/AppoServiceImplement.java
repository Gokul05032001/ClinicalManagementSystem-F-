package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IAppointmentRepository;
import com.faith.app.dto.AppointmentDTO;

import com.faith.app.entity.Appointment;


@Service
public class AppoServiceImplement implements IAppointmentService {
	
	@Autowired
	private IAppointmentRepository appointmentRepo;

	@Override
	public List<Appointment> getAppointments() {
		
		return  (List<Appointment>) appointmentRepo.findAll();
	}

	@Override
	public List<AppointmentDTO> getAllDTOAppointments() {
		
		return (List<AppointmentDTO>) appointmentRepo.getAllDTOAppointmentDetails();
	}

}
