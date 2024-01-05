package Car.CarTypes;

import Car.MonthlyRentalCar;

public class Hatchback extends MonthlyRentalCar {

    public Hatchback(String brand, String model, String color, int luggageCapacity, String fuelType, double dailyRentalFee, int age) {
        super(brand, model, color, luggageCapacity, fuelType, dailyRentalFee, age);
    }

    @Override
    public double calculateMonthlyRentalCost(int period) {
        double res= this.calculateDailyRentalCost(30) * period;
        return res;
    }

    @Override
    public double calculateDailyRentalCost(int period) {

        double res = this.getDailyRentalFee()*period;
        return res;
    }
}
