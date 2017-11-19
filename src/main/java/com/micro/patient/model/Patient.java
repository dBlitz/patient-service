package com.micro.patient.model;


import java.util.Date;

public class Patient {

	private Integer patientId;
	private Integer doctorId;
	private String phoneNumber;
	private String patientName;
	private String birthday;
	private String phone;
	private String address;
	private String email;
	private String city;
	private String zipCode;
	private String SSN;


	public Patient() {

	}

	public Patient(Integer patientId, Integer doctorId, String phoneNumber, String patientName, String birthday, String phone, String address, String email, String city, String zipCode, String SSN) {
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.phoneNumber = phoneNumber;
		this.patientName = patientName;
		this.birthday = birthday;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.city = city;
		this.zipCode = zipCode;
		this.SSN = SSN;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getNumber() {
		return phoneNumber;
	}

	public void setNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String SSN) {
		this.SSN = SSN;
	}
	
	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


}