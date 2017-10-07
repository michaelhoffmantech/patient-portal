package com.pluralsight.patientportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pluralsight.patientportal.domain.Appointment;

@SuppressWarnings("unused")
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
	List<Appointment> findByUserId(Long userId); 
}
