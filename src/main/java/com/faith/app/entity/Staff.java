package com.faith.app.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="staff")
public class Staff {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int staffId;
	
	
	private int userId;
	
	private String staffNo;
	
	private String fullName;
	
	private LocalDate dob;
	
	private String mobileno;
	
	private String address;
	
	private LocalDate doj;
	
	private double salary;
	
	private String email;
	
	private String isActive;
	
	
	@CreationTimestamp
	@Column(name = "created_date")
	private LocalDate createdDate;
	 
	 
	@OneToOne
	@JoinColumn(name="userId", insertable = false, updatable = false)
	private User user;


	public Staff() {
		super();
	}

	
	public Staff(int staffId, int userId, String staffNo, String fullName, LocalDate dob, String mobileno,
			String address, LocalDate doj, double salary, String email, String isActive, LocalDate createdDate,
			User user) {
		super();
		this.staffId = staffId;
		this.userId = userId;
		this.staffNo = staffNo;
		this.fullName = fullName;
		this.dob = dob;
		this.mobileno = mobileno;
		this.address = address;
		this.doj = doj;
		this.salary = salary;
		this.email = email;
		this.isActive = isActive;
		this.createdDate = createdDate;
		this.user = user;
	}


	public int getStaffId() {
		return staffId;
	}


	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getStaffNo() {
		return staffNo;
	}


	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public String getMobileno() {
		return mobileno;
	}


	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public LocalDate getDoj() {
		return doj;
	}


	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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

	@JsonBackReference
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", userId=" + userId + ", staffNo=" + staffNo + ", fullName=" + fullName
				+ ", dob=" + dob + ", mobileno=" + mobileno + ", address=" + address + ", doj=" + doj + ", salary="
				+ salary + ", email=" + email + ", isActive=" + isActive + ", createdDate=" + createdDate + ", user="
				+ user + "]";
	}
	
	
	
}
