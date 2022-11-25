package com.faith.app.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="labtestPrescribed")
public class LabTestPrescribed {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int labtestprescribeId;
	
	
	private int labtestId;
	
	@ManyToOne
	@JoinColumn(name="labtestId",insertable = false,updatable = false)
	private LabTest labTest; 
	
	private int appoinId;
	
	@ManyToOne
	@JoinColumn(name="appoinId",insertable = false,updatable = false)
	private Appointment appointment; 
	
	private String isActive;
	
	
	
	
	private LocalDate createdDate;




	public LabTestPrescribed() {
		super();
	}




	public LabTestPrescribed(int labtestprescribeId, int labtestId, LabTest labTest, int appoinId,
			Appointment appointment, String isActive, LocalDate createdDate) {
		super();
		this.labtestprescribeId = labtestprescribeId;
		this.labtestId = labtestId;
		this.labTest = labTest;
		this.appoinId = appoinId;
		this.appointment = appointment;
		this.isActive = isActive;
		this.createdDate = createdDate;
	}




	public int getLabtestprescribeId() {
		return labtestprescribeId;
	}




	public void setLabtestprescribeId(int labtestprescribeId) {
		this.labtestprescribeId = labtestprescribeId;
	}




	public int getLabtestId() {
		return labtestId;
	}




	public void setLabtestId(int labtestId) {
		this.labtestId = labtestId;
	}



	@JsonBackReference
	public LabTest getLabTest() {
		return labTest;
	}




	public void setLabTest(LabTest labTest) {
		this.labTest = labTest;
	}




	public int getAppoinId() {
		return appoinId;
	}




	public void setAppoinId(int appoinId) {
		this.appoinId = appoinId;
	}



	@JsonIgnore
	public Appointment getAppointment() {
		return appointment;
	}




	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}




	public String getIsActive() {
		return isActive;
	}




	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}




	public LocalDate getCreatedDate() {
		return createdDate;
	}




	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}




	@Override
	public String toString() {
		return "LabTestPrescribed [labtestprescribeId=" + labtestprescribeId + ", labtestId=" + labtestId + ", labTest="
				+ labTest + ", appoinId=" + appoinId + ", appointment=" + appointment + ", isActive=" + isActive
				+ ", createdDate=" + createdDate + "]";
	}




}
