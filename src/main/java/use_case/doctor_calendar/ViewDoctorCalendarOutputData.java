package use_case.doctor_calendar;

import entity.Appointment;

public class ViewDoctorCalendarOutputData {
    private final Appointment[] doctorAppointment;

    public ViewDoctorCalendarOutputData(Appointment[] doctorAppointment) {
        this.doctorAppointment = doctorAppointment;
    }

    Appointment[] getDoctorAppointment(){
        return this.doctorAppointment;
    }
}
