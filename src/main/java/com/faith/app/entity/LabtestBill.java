package com.faith.app.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name= "labtestbill")
public class LabtestBill {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int billId;
	
	
	private int appoinId;
	
	@ManyToOne
	@JoinColumn(name="appoinId", insertable = false, updatable = false)
	private Appointment  appointment; 
	
	private double billAmount;
	
	private String isActive;
	
	
	@CreationTimestamp
	@Column(name = "created_date")
	private LocalDate createdDate;


	public LabtestBill() {
		super();
	}


	public LabtestBill(int billId, int appoinId, Appointment appointment, double billAmount, String isActive,
			LocalDate createdDate) {
		super();
		this.billId = billId;
		this.appoinId = appoinId;
		this.appointment = appointment;
		this.billAmount = billAmount;
		this.isActive = isActive;
		this.createdDate = createdDate;
	}


	public int getBillId() {
		return billId;
	}


	public void setBillId(int billId) {
		this.billId = billId;
	}


	public int getAppoinId() {
		return appoinId;
	}


	public void setAppoinId(int appoinId) {
		this.appoinId = appoinId;
	}

	@JsonBackReference
	public Appointment getAppointment() {
		return appointment;
	}


	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}


	public double getBillAmount() {
		return billAmount;
	}


	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
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
		return "LabtestBill [billId=" + billId + ", appoinId=" + appoinId + ", appointment=" + appointment
				+ ", billAmount=" + billAmount + ", isActive=" + isActive + ", createdDate=" + createdDate + "]";
	}
	
	
	
}
