package Car;


public abstract class MonthlyRentalCar extends Car {


    public MonthlyRentalCar(String brand, String model, String color, int luggageCapacity, int age, String fuelType, double dailyRentalFee) {
        super(brand, model, color, luggageCapacity, age, fuelType, dailyRentalFee);
    }

    public abstract double calculateMonthlyRentalCost(int period);

}
