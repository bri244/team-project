package use_case.doctor_calendar;

/**
 * The output boundary for the ViewDoctorCalendar Use Case.
 */
public interface ViewDoctorCalendarOutputBoundary {
    /**
     * Prepares the success view for the ViewDoctorCalendar Use Case.
     * @param viewDoctorCalendarOutputData the output data
     */
    void prepareSuccessView(ViewDoctorCalendarOutputData viewDoctorCalendarOutputData);

    /**
     * Prepares the failure view for the ViewDoctorCalendar Use Case.
     * @param errorMessage the explanation of the failure
     */
    void prepareFailView(String errorMessage);
}
