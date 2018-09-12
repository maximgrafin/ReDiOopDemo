import java.util.ArrayList;
import java.util.List;

public class Doctor extends Human {
    public List<Human> patients = new ArrayList<Human>();

    public Doctor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String getFullName() {
        return "Dr. " + lastName;
    }

    @Override
    public String toString() {
        return getFullName();
    }

    public void addPatient(Human patient) {
        for (Human another_patient : patients) {
            if (another_patient.equals(patient)) {
                System.out.println("The patient " + patient + " is already registerd");
                return;
            }
        }
        patients.add(patient);
    }
}

