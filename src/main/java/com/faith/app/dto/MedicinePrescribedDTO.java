package com.faith.app.dto;

import java.time.LocalDate;
import java.util.Date;

public class MedicinePrescribedDTO {
	
	private int patientId;
	private String fullName;
	
	private String medicineName;
	private String genericName;

    private String dosage;
	
	private String course; 

	
	private int medprescribeId;
	
	private LocalDate createdDate;

	public MedicinePrescribedDTO() {
		super();
	}

	public MedicinePrescribedDTO(int patientId, String fullName, String medicineName, String genericName,
			String dosage, String course, int medprescribeId, LocalDate createdDate) {
		super();
		this.patientId = patientId;
		this.fullName = fullName;
		this.medicineName = medicineName;
		this.genericName = genericName;
		this.dosage = dosage;
		this.course = course;
		this.medprescribeId = medprescribeId;
		this.createdDate = createdDate;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getGenericName() {
		return genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getMedprescribeId() {
		return medprescribeId;
	}

	public void setMedprescribeId(int medprescribeId) {
		this.medprescribeId = medprescribeId;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "MedicinePrescribedtDTO [patientId=" + patientId + ", fullName=" + fullName + ", medicineName="
				+ medicineName + ", genericName=" + genericName + ", dosage=" + dosage + ", course=" + course
				+ ", medprescribeId=" + medprescribeId + ", createdDate=" + createdDate + "]";
	}
	
	
    

}
