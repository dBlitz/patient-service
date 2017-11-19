package com.micro.patient.api;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.micro.patient.model.Appointment;
import com.micro.patient.model.Doctor;

@FeignClient(name = "doctor-service", url = "http://localhost:5555")
@Service
public interface DoctorClient {

    @RequestMapping(method = RequestMethod.GET, value = "/doctors/{doctorId}")
    Doctor getAppointments(@PathVariable("doctorId") Integer doctorId);


}
