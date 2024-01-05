package Car;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int luggageCapacity;
    private int age;
    private String fuelType;
    private double dailyRentalFee;

    public Car(String brand, String model, String color, int luggageCapacity, String fuelType, double dailyRentalFee, int age) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.luggageCapacity = luggageCapacity;
        this.fuelType = fuelType;
        this.dailyRentalFee = dailyRentalFee;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(int luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getDailyRentalFee() {
        return dailyRentalFee;
    }

    public void setDailyRentalFee(double dailyRentalFee) {
        this.dailyRentalFee = dailyRentalFee;
    }

    public double calculateDailyRentalCost(int period){
        return 0;
    }
    //dogru bir kullanim mi?
}
