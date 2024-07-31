package com.dcat23.patientportaldemo.controller;

import com.dcat23.patientportaldemo.dto.AppointmentBookingRequest;
import com.dcat23.patientportaldemo.dto.RescheduleRequest;
import com.dcat23.patientportaldemo.model.Appointment;
import com.dcat23.patientportaldemo.model.AvailableSlot;
import com.dcat23.patientportaldemo.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/appointments")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class AppointmentController {

    private final AppointmentService appointmentService;


    @GetMapping("/available-slots")
    public ResponseEntity<List<AvailableSlot>> getAvailableSlots(@RequestParam Long doctorId, @RequestParam LocalDateTime date) {
        List<AvailableSlot> availableSlots = appointmentService.getAvailableSlots(doctorId, date);
        return ResponseEntity.ok(availableSlots);
    }

    @PostMapping("/book")
    public ResponseEntity<Appointment> bookAppointment(@RequestBody AppointmentBookingRequest request) {
        Appointment appointment = appointmentService.bookAppointment(request);
        return ResponseEntity.ok(appointment);
    }

    @PutMapping("/{id}/reschedule")
    public ResponseEntity<Appointment> rescheduleAppointment(@PathVariable Long id, @RequestBody RescheduleRequest request) {
        Appointment appointment = appointmentService.rescheduleAppointment(request);
        return ResponseEntity.ok(appointment);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancelAppointment(@PathVariable Long id) {
        appointmentService.cancelAppointment(id);
        return ResponseEntity.noContent().build();
    }

}
