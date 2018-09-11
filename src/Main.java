public class Main {

    public static void main(String[] args) {
        Human me = new Human();
        me.firstName = "Maksim";
        me.lastName = "Sadym";

        Human meToo = new Human();
        meToo.firstName = "Maksim";
        meToo.lastName = "Sadym";

        Human myFriend = new Human();
        myFriend.firstName = "Sadik";
        myFriend.lastName = "Hasanovic";

        Doctor myDoctor = new Doctor();
        myDoctor.firstName = "Gregory";
        myDoctor.lastName = "House";

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

