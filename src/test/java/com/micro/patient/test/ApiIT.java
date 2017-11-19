package com.micro.patient.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.micro.patient.Application;
import com.micro.patient.api.AppointmentClient;
import com.micro.patient.api.DoctorClient;
import com.micro.patient.model.Appointment;

import com.micro.patient.model.Doctor;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;


//import java.nio.charset.Charset;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.http.MediaType;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class ApiIT {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";
    static Logger logger = Logger.getLogger(ApiIT.class.getName());
    public String spaces = "\n\n\n\n\n\n\n\n\n\n";

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;


//    @Autowired
//    private PatientClient patientClient;
    @Autowired
    private AppointmentClient appointmentClient;
    @Autowired
    private DoctorClient doctorClient;

    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();

//        this.accountRepository.deleteAllInBatch();
//
//        this.account = accountRepository.save(new Account(userName, "password"));
//        this.bookmarkList.add(bookmarkRepository.save(new Bookmark(account, "http://bookmark.com/1/" + userName, "A description")));
//        this.bookmarkList.add(bookmarkRepository.save(new Bookmark(account, "http://bookmark.com/2/" + userName, "A description")));
    }


    // @Test
    // public void getDoctorClientResponse() throws Exception {

    //     Doctor appoinmentList = doctorClient.getAppointments(1);
    //     ObjectMapper mapper = new ObjectMapper();


    //     try {
    //         String theAppointment = mapper.writeValueAsString(appoinmentList);
    //         logger.info(spaces + ANSI_WHITE + "This is an appointment for Patient #1: " + theAppointment + ANSI_RESET + spaces);

    //     } catch (IOException ioe) {
    //         logger.error("Get Appointment Client Response Test: Was not able to call appointmentClient feign call to get appointments for patient #1");
    //         ioe.getStackTrace();
    //     }

    // }


    //Working
//    @Test
//    public void getAppointmentClientResponse() throws Exception {
//
//        List<Appointment> appoinmentList = appointmentClient.getAppointments(1);
//        ObjectMapper mapper = new ObjectMapper();
//
//        try {
//            String theAppointment = mapper.writeValueAsString(appoinmentList);
//            logger.info(spaces + ANSI_WHITE + "This is an appointment for Patient #1: " + theAppointment + ANSI_RESET + spaces);
//
//        } catch (IOException ioe) {
//        	logger.error("Get Appointment Client Response Test: Was not able to call appointmentClient feign call to get appointments for patient #1");
//        	ioe.getStackTrace();
//        }
//
//    }

//    @Test
//    public void getDoctorClientResponse() throws Exception {
//
//        List<Appointment> appoinmentList = appointmentClient.getAppointments(2);
//        ObjectMapper mapper = new ObjectMapper();
//
//
//        try {
//            String theAppointment = mapper.writeValueAsString(appoinmentList);
//            logger.info(spaces + ANSI_WHITE + "This is an appointment for Patient #1: " + theAppointment + ANSI_RESET + spaces);
//
//        } catch (IOException ioe) {
//            logger.error("Get Appointment Client Response Test: Was not able to call appointmentClient feign call to get appointments for patient #1");
//            ioe.getStackTrace();
//        }
//
//    }

//
//    @Test
//    public void getAppointmentAndDoctorClientResponse() {
//
//        List<Patient> patientList = patientClient.getPatients(1);
//        List<Appointment> appointmentList = appointmentClient.getAppointments(1);
//        ObjectMapper mapper = new ObjectMapper();
//
//        for (Appointment appointment : appointmentList) {
//            for (Patient patient : patientList) {
//                if (appointment.getPatientId().equals(patient.getPatientId())) {
//                    appointment.setPatient(patient);
//                    try {
//                        String theAppointment = mapper.writeValueAsString(appointment);
//                        logger.info(spaces + ANSI_WHITE + "This is an appointment for Doctor #1: " + theAppointment + ANSI_RESET + spaces);
//
//                    } catch (IOException ioe) {
//
//                    }
//                }
//            }
//        }
//    }

    //Working
//    @Test
//    public void getAppointmentClientResponse() {
//
//        List<Patient> patientList = patientClient.getPatients(1);
//        List<Appointment> appointmentList = appointmentClient.getAppointments(1);
//
//        List<String> allPatients = patientListToListString(patientList);
//        List<String> allAppointments = appointmentlistToString(appointmentList);
//
//        List<String> newAppointmentList = new ArrayList<>();
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (String appointment : allAppointments) {
//            int indexAppointment = 0;
//            for (String patient : allPatients) {
//                JSONObject jsonObjectPatients = new JSONObject(patient);
//                String patientIdPatient = jsonObjectPatients.getString("patientId");
//                JSONObject jsonObjectAppointments = new JSONObject(appointment);
//                System.out.println("hello hello hello " + jsonObjectAppointments);
//                String patientIdAppointment = jsonObjectAppointments.getString("patientId");
//
//                if (patientIdPatient.equals(patientIdAppointment)) {
//                    allAppointments.set(indexAppointment, appointment + patient);
//                    logger.info(spaces + ANSI_WHITE + "All appointment of doctor #1: " + allAppointments.get(indexAppointment) + ANSI_RESET + spaces);
//                }
//            }
//        }
//    }


    //Working
    @Test
    public void getAllPatients() throws Exception {

        MvcResult result = mockMvc.perform(get("/patients").contentType(MediaType.APPLICATION_JSON)
                .content(""))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        String content = result.getResponse().getContentAsString();
        logger.info(spaces + ANSI_WHITE + "All the Patients: " + content + ANSI_RESET + spaces);

    }

    //Working
    @Test
    public void getOnePatient() throws Exception {


        MvcResult result = mockMvc.perform(get("/patients/1").contentType(MediaType.APPLICATION_JSON)
                .content(""))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        String content = result.getResponse().getContentAsString();
        logger.info(spaces + ANSI_WHITE + "Patient #1: " + content + ANSI_RESET + spaces);

    }



//    Working





}
