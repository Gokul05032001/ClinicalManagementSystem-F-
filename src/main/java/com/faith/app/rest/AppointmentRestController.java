package com.faith.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.dto.AppointmentDTO;
import com.faith.app.entity.Appointment;
import com.faith.app.service.IAppointmentService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class AppointmentRestController {
	
	
	@Autowired
	private IAppointmentService  appointmentService;
	
	//Get all Employees
		@GetMapping("/appointments")
		public List<Appointment> getAllAppointments(){
			
			return appointmentService.getAppointments();
			
		}
		
		
		@GetMapping("/appointments/dto")
		public List<AppointmentDTO> getAllDTOAppointments(){
			
			return appointmentService.getAllDTOAppointments();
			
		}

}
