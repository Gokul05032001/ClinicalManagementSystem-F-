package com.faith.app.dto;

import java.time.LocalDate;
import java.util.Date;

public class NotesPrescribedDTO {
	private int patientId;
	private String fullName;
	
	
	private int notesId;
	
	private String notes;
	
	private LocalDate createdDate;

	public NotesPrescribedDTO() {
		super();
	}

	public NotesPrescribedDTO(int patientId, String fullName, int notesId, String notes, LocalDate createdDate) {
		super();
		this.patientId = patientId;
		this.fullName = fullName;
		this.notesId = notesId;
		this.notes = notes;
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

	public int getNotesId() {
		return notesId;
	}

	public void setNotesId(int notesId) {
		this.notesId = notesId;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "NotesPrescribedDTO [patientId=" + patientId + ", fullName=" + fullName + ", notesId=" + notesId
				+ ", notes=" + notes + ", createdDate=" + createdDate + "]";
	}
	
	
}
