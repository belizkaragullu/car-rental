package Car;

public abstract class MonthlyRentalCar extends Car {

    public MonthlyRentalCar(String brand, String model, String color, int luggageCapacity, String fuelType, double dailyRentalFee, int age) {
        super(brand, model, color, luggageCapacity, fuelType, dailyRentalFee, age);
    }

    public abstract double calculateMonthlyRentalCost(int period);
    //getter setter gerekli mi?

}
