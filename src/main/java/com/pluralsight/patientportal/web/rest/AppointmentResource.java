package com.pluralsight.patientportal.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.pluralsight.patientportal.domain.Appointment;
import com.pluralsight.patientportal.web.rest.util.HeaderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * REST Controller for managing appointments
 */
@RestController
@RequestMapping("/api")
public class AppointmentResource {

    private static final Logger log = LoggerFactory.getLogger(AppointmentResource.class);

    private static List<Appointment> appointments = new ArrayList<>();

    /**
     *
     */
    public AppointmentResource() {

    }

    @GetMapping("/appointments")
    @Timed
    public List<Appointment> getAllAppointments() {
        return appointments;
    }

    @PostMapping("/appointments")
    @Timed
    public ResponseEntity<Appointment> createAppointment(@Valid @RequestBody Appointment appointment) throws Exception {
        appointment.setId(appointments.size());
        appointments.add(appointment);
        return ResponseEntity
            .created(new URI("/api/appointments" + appointment.getId()))
            .headers(HeaderUtil.createEntityCreationAlert("appointment", appointment.getId().toString()))
            .body(appointment);
    }
}
