package com.dcat23.patientportaldemo.repository;

import com.dcat23.patientportaldemo.model.AvailableSlot;
import com.dcat23.patientportaldemo.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AvailableSlotRepository extends JpaRepository<AvailableSlot, Long> {
    List<AvailableSlot> findByDoctorAndStartTimeBetweenAndIsBookedFalse(Doctor doctor, LocalDateTime start, LocalDateTime end);
}
