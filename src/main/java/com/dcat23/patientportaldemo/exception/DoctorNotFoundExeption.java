package com.dcat23.patientportaldemo.exception;

public class DoctorNotFoundExeption extends RuntimeException {



    public DoctorNotFoundExeption(Long doctorId) {
        super("Doctor Not Found: " + doctorId);
    }

    public DoctorNotFoundExeption(String message) {
        super(message);
    }
}
