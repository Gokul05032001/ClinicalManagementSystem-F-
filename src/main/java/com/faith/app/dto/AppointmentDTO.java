package com.faith.app.dto;

import java.time.LocalDate;
import java.util.Date;

public class AppointmentDTO {
	
	private int appoinId;
	
	
	private int patientId;
	
	private String tokenNum;
	
	private int docId;
	

	
	private String fullName;
	
	private LocalDate doa;
	
	
	private LocalDate createdDate;


	public AppointmentDTO() {
		super();
	}


	public AppointmentDTO(int appoinId, int patientId, String tokenNum, int docId, String fullName, LocalDate doa,
			LocalDate createdDate) {
		super();
		this.appoinId = appoinId;
		this.patientId = patientId;
		this.tokenNum = tokenNum;
		this.docId = docId;
		this.fullName = fullName;
		this.doa = doa;
		this.createdDate = createdDate;
	}


	public int getAppoinId() {
		return appoinId;
	}


	public void setAppoinId(int appoinId) {
		this.appoinId = appoinId;
	}


	public int getPatientId() {
		return patientId;
	}


	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}


	public String getTokenNum() {
		return tokenNum;
	}


	public void setTokenNum(String tokenNum) {
		this.tokenNum = tokenNum;
	}


	public int getDocId() {
		return docId;
	}


	public void setDocId(int docId) {
		this.docId = docId;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public LocalDate getDoa() {
		return doa;
	}


	public void setDoa(LocalDate doa) {
		this.doa = doa;
	}


	public LocalDate getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}


	@Override
	public String toString() {
		return "AppointmentDTO [appoinId=" + appoinId + ", patientId=" + patientId + ", tokenNum=" + tokenNum
				+ ", docId=" + docId + ", fullName=" + fullName + ", doa=" + doa + ", createdDate=" + createdDate + "]";
	}
	
	

}
