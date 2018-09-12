public class Human extends Object {
    public String firstName;
    public String lastName;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return getFullName();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Human) {
            Human human = (Human) object;
            return lastName.equals(human.lastName)
                   && firstName.equals(human.firstName);
        }
        return false;
    }
}

