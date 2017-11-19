package com.micro.patient.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(org.springframework.http.HttpStatus.NOT_FOUND)
public class PatientNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public PatientNotFoundException(String patientNumber) {
		super("No such Patient: " + patientNumber);
	}
	
}
