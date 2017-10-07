package com.pluralsight.patientportal.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.patientportal.domain.Appointment;
import com.pluralsight.patientportal.repository.AppointmentRepository;

@Service
@Transactional
public class AppointmentService {

	private final Logger log = LoggerFactory.getLogger(AppointmentService.class);

	private final AppointmentRepository appointmentRepository;

	public AppointmentService(AppointmentRepository appointmentRepository) {
		this.appointmentRepository = appointmentRepository;
	}

	/**
	 * Save a appointment.
	 *
	 * @param appointment
	 *            the entity to save
	 * @return the persisted entity
	 */
	public Appointment save(Appointment appointment) {
		log.debug("Request to save Appointment : {}", appointment);
		return appointmentRepository.save(appointment);
	}

	/**
	 * Get all the appointments.
	 *
	 * @return the list of entities
	 */
	@Transactional(readOnly = true)
	public List<Appointment> findAllByUser(Long userId) {
		log.debug("Request to get all Appointments");
		return appointmentRepository.findByUserId(userId);
	}
}
