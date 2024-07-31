package com.dcat23.patientportaldemo.service;

import com.dcat23.patientportaldemo.dto.AppointmentBookingRequest;
import com.dcat23.patientportaldemo.exception.DoctorNotFoundExeption;
import com.dcat23.patientportaldemo.model.Appointment;
import com.dcat23.patientportaldemo.model.AvailableSlot;
import com.dcat23.patientportaldemo.model.Doctor;
import com.dcat23.patientportaldemo.repository.AppointmentRepository;
import com.dcat23.patientportaldemo.repository.AvailableSlotRepository;
import com.dcat23.patientportaldemo.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final AvailableSlotRepository availableSlotRepository;
    private final DoctorRepository doctorRepository;

    /**
     * @param doctorId
     * @param date
     * @return
     */
    @Override
    public List<AvailableSlot> getAvailableSlots(Long doctorId, LocalDateTime date) {

        Doctor doctor = findDoctorById(doctorId);
        List<AvailableSlot> availableSlots = availableSlotRepository.findByDoctorAndStartTimeBetweenAndIsBookedFalse(
                doctor,
                date,
                date
        );

        return List.of();
    }

    private Doctor findDoctorById(Long doctorId) {
        return doctorRepository.findById(doctorId)
                .orElseThrow(() -> new DoctorNotFoundExeption(doctorId));
    }

    /**
     * @param request
     * @return
     */
    @Override
    public Appointment bookAppointment(AppointmentBookingRequest request) {
        return null;
    }
}
