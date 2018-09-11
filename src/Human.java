public class Human extends Object {
    public String firstName;
    public String lastName;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString(){
        return getFullName();
    }
}

