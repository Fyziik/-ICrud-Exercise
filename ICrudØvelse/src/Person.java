public class Person {

    private String name;
    private int phoneNumber;
    private int ID;

    public Person(String name, int phoneNumber, int ID) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getID() {
        return ID;
    }

    public String toString() {
        return "Name: " + this.name + '\n' +
                "Phone number: " + this.phoneNumber + '\n' +
                        "ID: " + this.ID;
    }
}
