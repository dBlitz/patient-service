package com.micro.patient.api;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.micro.patient.model.Appointment;

@FeignClient(name = "appointment-service", url = "http://localhost:3333")
@Service
public interface AppointmentClient {

    @RequestMapping(method = RequestMethod.GET, value = "/appointments/patients/{patientId}")
    List<Appointment> getAppointments(@PathVariable("patientId") Integer patientId);

}
