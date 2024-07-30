# Patient Portal

The Patient Portal Application will be a web-based platform allowing patients to manage various aspects
of their healthcare interactions with Santara Health in Norfolk.

This project will improve patient engagement, streamline administrative processes,
and enhance the overall healthcare experience.

## Tech Stack
- **Frontend**: React.js for a responsive and interactive user interface
- **Backend**: Java Spring Boot for robust API development and business logic
- **Database**: PostgreSQL for data persistence
- **Security**: Spring Security for authentication and authorization
- **API Documentation**: Swagger for clear API documentation

## Key Components and Features

1. **User Authentication and Profile Management**
   - [] Secure login system with multi-factor authentication
   - [] User profile creation and management
   - [] Password reset functionality
2. **Appointment Scheduling and Management**
   - [] Calendar integration for viewing available slots
   - [] Appointment booking, rescheduling, and cancellation
   - [] Automated reminders via email and SMS
3. **Medical Records and Test Results Viewer**
   - [] Secure display of patient medical history
   - [] Lab and test results presentation with historical data
   - [] Option to download and print records
4. **Secure Messaging System**
   - [] HIPAA-compliant messaging between patients and healthcare providers
   - [] File attachment capabilities for sharing documents or images
   - [] Notification system for new messages
5. **Prescription Refill Requests**
   - [] List of current prescriptions
   - [] Refill request form with automated routing to appropriate healthcare provider
   - [] Status tracking for refill requests
6. **Online Bill Payment**
   - [] Display of current and past bills
   - [] Multiple payment options (credit card, ACH, etc.)
   - [] Payment history and receipt generation


## Appointment Scheduling and Management Service
- `GET /api/appointments/available-slots`
   - Retrieve available slots for a specific doctor on a given date.
   - Parameters:
   - doctorId (required): ID of the doctor
   - date (required): Date to check available slots (format: YYYY-MM-DD)
- `POST /api/appointments/book`
Book an appointment for a patient.
Request Body:
patientId (required): ID of the patient
slotId (required): ID of the available slot
- `PUT /api/appointments/{id}/reschedule`
Reschedule an existing appointment.
Parameters:
id (required): ID of the appointment
Request Body:
newSlotId (required): ID of the new available slot
- `DELETE /api/appointments/{id}`
Cancel an appointment.
Parameters:
id (required): ID of the appointment
Database Schema
Appointment Scheduling and Management Service
Appointments
id (Primary key)
patient_id (Foreign key to Patients table)
doctor_id (Foreign key to Doctors table)
appointment_time (DateTime)
status (ENUM: 'SCHEDULED', 'CANCELLED', 'COMPLETED')
appointment_type (VARCHAR)
created_at (DateTime)
AvailableSlots
id (Primary key)
doctor_id (Foreign key to Doctors table)
start_time (DateTime)
end_time (DateTime)
is_booked (BOOLEAN)
created_at (DateTime)
