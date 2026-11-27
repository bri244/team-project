package use_case.doctor_calendar;

public class ViewDoctorCalendarInputData {

    private final String doctorUsername;

    public ViewDoctorCalendarInputData(String doctorUsername) {
        this.doctorUsername = doctorUsername;
    }

    String getDoctorUsername(){
        return this.doctorUsername;
    }
}
