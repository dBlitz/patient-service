package com.micro.patient.api;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.micro.patient.model.Appointment;
import com.micro.patient.model.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

	private List<Patient> patients;
	private Patient patient;
	
	@Autowired
	private AppointmentClient appointmentClient;

	protected Logger logger = Logger.getLogger(Api.class.getName());

	public Api() {
		
		patients = new ArrayList<>();
		patients.add(new Patient(1, 1, "832-4833-2725", "Devin Blitzer", "05/15/1994", "832-483-2725", "2708 San Pedro St", "devblitzer@gmail.com", "Austin", "78705", "***-**-****"));
		patients.add(new Patient(2, 1, "34324232", "Yo Yo YO Blitzer", "05/2323", "fdafadsf", "2708 San Pedro St", "devblitzer@gmail.com", "Austin", "78705", "***-**-****"));
		patients.add(new Patient(3, 1, "832-4833-2725", "Sup Sup Sup", "05/323", "8aaaaaaa", "2708 San Pedro St", "devblitzer@gmail.com", "Austin", "78705", "***-**-****"));
		
	}
	
	//create patient
	//update patient
	//delete patient (for testing purposes probably can't delete patient data)
	//get medical history
	
	//get all patients
	@RequestMapping("/patients")
	public List<Patient> findAll() {
		logger.info("Patient.findAll()");
		return patients;
	}

	//get one patient
	@RequestMapping("/patients/{patientId}")
	public Patient findByNumber(@PathVariable("patientId") Integer patientId) {
		logger.info(String.format("Patient.findByNumber(%s)", patientId));
		return patients.stream().filter(it -> it.getPatientId().equals(patientId)).findFirst().get();
	}

	//get all appointments of patient
	@RequestMapping("/patients/appointment/{appointmentId}")
	public List<Appointment> findByPatient(@PathVariable("appointmentId") Integer patientId) {
		logger.info(String.format("Patient.findByPatient(%s)", patientId));
		List<Appointment> patientAppointments = appointmentClient.getAppointments(patientId);
//		return patient.getPatientId().intValue()==patientId.intValue();
		return patientAppointments;
	}

	//REMOTE
	//FeignClient call from doctor-service
	@RequestMapping("/patients/doctor/{doctorId}")
	public List<Patient> findPatientsByDoctorAppintment(@PathVariable("doctorId") Integer doctorId) {
		
		return patients.stream().filter(it -> it.getDoctorId().intValue()==doctorId.intValue()).collect(Collectors.toList());
		
	}
	
	
//	@RequestMapping("/patients/appointment/{appointmentId}")
//	public Patient findByPatient(@PathVariable("appointmentId") Integer patientId) {
//		logger.info(String.format("Patient.findByPatient(%s)", patientId));
//		return patient.stream().filter(it -> it.getPatientId().intValue()==patientId.intValue()).collect(Collectors.toList());
//	}



}

