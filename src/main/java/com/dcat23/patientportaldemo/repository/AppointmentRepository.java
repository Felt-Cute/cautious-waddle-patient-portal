package com.dcat23.patientportaldemo.repository;

import com.dcat23.patientportaldemo.model.Appointment;
import com.dcat23.patientportaldemo.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByPatientAndAppointmentTimeBetween(Patient patient, LocalDateTime start, LocalDateTime end);
}
