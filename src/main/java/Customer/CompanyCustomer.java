package Customer;

public class CompanyCustomer extends Customer {
    private String companyName;

    public CompanyCustomer(int phoneNumber, String companyName) {
        super( phoneNumber);
        this.companyName = companyName;
        setCanRentAllCars(true);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
