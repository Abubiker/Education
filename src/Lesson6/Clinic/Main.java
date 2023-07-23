package Lesson6.Clinic;

public class Main {
    static Doctor surgeon = new Surgeon();
    static Doctor therapist = new Therapist();
    static Doctor dentist = new Dentist();


    public static void main(String[] args) {
        Patient patient = new Patient();
        TreatmentPlan treatmentPlan = new TreatmentPlan(1);
        patient.setTreatmentPlan(treatmentPlan);
        patient.setName("Коля");
        findDoctor(patient);
    }

    public static void findDoctor(Patient patient) {
        switch (patient.getTreatmentPlan().getCode()) {
            case 1:
                patient.getTreatmentPlan().setDoctor(surgeon);
                surgeon.treat();
                break;
            case 2:
                patient.getTreatmentPlan().setDoctor(dentist);
                dentist.treat();
                break;
            default:
                patient.getTreatmentPlan().setDoctor(therapist);
                therapist.treat();
                break;


        }

    }
}
