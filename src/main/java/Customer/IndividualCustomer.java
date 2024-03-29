package Customer;

public class IndividualCustomer extends Customer {
    private String name;
    private String surname;

    public IndividualCustomer(int phoneNumber, String name, String surname) {
        super(phoneNumber);
        this.name = name;
        this.surname = surname;
        setCanRentAllCars(false);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
