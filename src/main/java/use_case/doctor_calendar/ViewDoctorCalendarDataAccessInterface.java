package use_case.doctor_calendar;

import entity.Appointment;

/**
 * DAO interface for the ViewDoctorCalendar Use Case.
 */
public interface ViewDoctorCalendarDataAccessInterface {

    /**
     * Returns the array of all the appointment of a doctor.
     *@param doctorUsername the username of a doctor
     * @return the array of all the appointment of a doctor
     */
    Appointment[]  getAppointment(String doctorUsername);

    /**
     * Check if the doctor has any appointment.
     *@param doctorUsername the username of a doctor
     * @return True if the doctor has any upcoming appointments
     */
    Boolean  existsAppointment(String doctorUsername);
}