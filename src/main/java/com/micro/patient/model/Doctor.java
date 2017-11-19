package com.micro.patient.model;

import java.util.List;

public class Doctor {

	private Integer id;
	private Integer doctorId;
	private String number;
	private List<Appointment> appointmentList;

	public Doctor() {

	}

	public Doctor(Integer id, Integer doctorId, String number) {
		this.id = id;
		this.doctorId = doctorId;
		this.number = number;
	}

	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointments) {
		this.appointmentList = appointments;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
