package Customer;


public  class Customer {

    private boolean canRentAllCars;
    private int phoneNumber;

    public Customer( int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isCanRentAllCars() {
        return canRentAllCars;
    }

    public void setCanRentAllCars(boolean canRentAllCars) {
        this.canRentAllCars = canRentAllCars;
    }
}
