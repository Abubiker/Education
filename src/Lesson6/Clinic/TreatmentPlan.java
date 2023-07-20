package Lesson6.Clinic;

public class TreatmentPlan {
    private int code;
    private Doctor doctor;

    public TreatmentPlan() {
    }

    public TreatmentPlan(int code, Doctor doctor) {
        this.code = code;
        this.doctor = doctor;
    }

    public TreatmentPlan(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
