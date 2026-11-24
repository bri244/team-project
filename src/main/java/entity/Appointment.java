package entity;

import java.time.LocalDateTime;

public class Appointment {
    private final String patientID;
    private final String patientName;
    private final Doctor doctor;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;
    private final String patientPhoneNumber;
    private final String visitReason;

    public Appointment(String patientID, String patientName, Doctor doctor, LocalDateTime startTime,
                       LocalDateTime endTime, String patientPhoneNumber, String visitReason){
        this.patientID = patientID;
        this.patientName = patientName;
        this.doctor = doctor;
        this.startTime = startTime;
        this.endTime = endTime;
        this.patientPhoneNumber = patientPhoneNumber;
        this.visitReason = visitReason;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public String getVisitReason() {
        return visitReason;
    }
}
