package com.dcat23.patientportaldemo.repository;

import com.dcat23.patientportaldemo.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
