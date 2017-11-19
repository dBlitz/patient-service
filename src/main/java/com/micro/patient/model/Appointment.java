package com.micro.patient.model;

import java.util.List;
import java.util.Date;

public class Appointment {


    private Integer id;
    private Integer patientId;
    private Integer doctorId;
    private String date;
    private String time;
    private String room;
    private String description;
    private Patient patient;
    //	private AppointmentStatus status = AppointmentStatus.NEW;


    public Appointment() {

    }

    public Appointment(Integer id, Integer patientId, String date, String description, String room, String time) {
        this.id = id;
        this.patientId = patientId;
        this.date = date;
        this.description = description;
        this.room = room;
        this.time = time;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPatients() {
        return patientId;
    }

    public void setPatients(Integer patientId) {
        this.patientId = patientId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }


}