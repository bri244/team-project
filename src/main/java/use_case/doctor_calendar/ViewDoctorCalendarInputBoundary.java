package use_case.doctor_calendar;

public interface ViewDoctorCalendarInputBoundary {

    /**
     * Executes the ViewDoctorCalendar use case.
     * @param viewDoctorCalendarInputData the input data
     */
    void execute(ViewDoctorCalendarInputData viewDoctorCalendarInputData);

    /**
     * Executes the switch to DoctorCalendarView use case.
     */
    void switchToDoctorCalendarView();
}
