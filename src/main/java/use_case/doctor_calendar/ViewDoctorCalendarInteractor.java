package use_case.doctor_calendar;

import entity.Appointment;

public class ViewDoctorCalendarInteractor implements ViewDoctorCalendarInputBoundary{
    private final ViewDoctorCalendarDataAccessInterface viewDoctorCalendarDataAccessObject;
    private final ViewDoctorCalendarOutputBoundary viewDoctorCalendarPresenter;

    public ViewDoctorCalendarInteractor(ViewDoctorCalendarDataAccessInterface viewDoctorCalendarDataAccessObject,
                                        ViewDoctorCalendarOutputBoundary viewDoctorCalendarPresenter) {
        this.viewDoctorCalendarDataAccessObject = viewDoctorCalendarDataAccessObject;
        this.viewDoctorCalendarPresenter = viewDoctorCalendarPresenter;
    }

    @Override
    public void execute(ViewDoctorCalendarInputData viewDoctorCalendarInputData) {
        if (!viewDoctorCalendarDataAccessObject.existsAppointment(viewDoctorCalendarInputData.getDoctorUsername())){
            viewDoctorCalendarPresenter.prepareFailView("No appointment yet");
        }
        else{
            String DoctorUsername = viewDoctorCalendarInputData.getDoctorUsername();
            Appointment[] appointments = viewDoctorCalendarDataAccessObject.getAppointment(DoctorUsername);
            ViewDoctorCalendarOutputData outputData = new ViewDoctorCalendarOutputData(appointments);
            viewDoctorCalendarPresenter.prepareSuccessView(outputData);
        }
    }
}
