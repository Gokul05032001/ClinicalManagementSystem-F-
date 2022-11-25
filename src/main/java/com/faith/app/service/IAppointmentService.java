package com.faith.app.service;

import java.util.List;

import com.faith.app.dto.AppointmentDTO;
import com.faith.app.entity.Appointment;

public interface IAppointmentService {
	
	//List
	public List<Appointment> getAppointments();
	
	
	//Find all lab test prescriptions by Id
	public List<AppointmentDTO>  getAllDTOAppointments();

}
