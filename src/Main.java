public class Main {

    public static void main(String[] args) {
        Human me = new Human("Maksim", "Sadym");

        Human meToo = new Human("Maksim", "Sadym");

        Human myFriend = new Human("Sadik", "Hasanovic");

        Doctor myDoctor = new Doctor("Gregory", "House");

        myDoctor.addPatient(me);
        myDoctor.addPatient(meToo);
        myDoctor.addPatient(myFriend);

        System.out.println("Doctor: " + myDoctor);
        System.out.println("Patients: ");

        for (Human patient : myDoctor.patients) {
            System.out.println(patient);
        }
    }
}

