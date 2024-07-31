package com.dcat23.patientportaldemo.service;

import com.dcat23.patientportaldemo.dto.AppointmentBookingRequest;
import com.dcat23.patientportaldemo.dto.RescheduleRequest;
import com.dcat23.patientportaldemo.model.Appointment;
import com.dcat23.patientportaldemo.model.AvailableSlot;

import java.time.LocalDateTime;
import java.util.List;

public interface AppointmentService {
    List<AvailableSlot> getAvailableSlots(Long doctorId, LocalDateTime date);

    Appointment bookAppointment(AppointmentBookingRequest request);

    Appointment rescheduleAppointment(RescheduleRequest request);

    void cancelAppointment(Long id);
}
