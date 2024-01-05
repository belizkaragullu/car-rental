package Car.CarTypes;

import Car.MonthlyRentalCar;

public class Sedan extends MonthlyRentalCar {


    public Sedan(String brand, String model, String color, int luggageCapacity, String fuelType, double dailyRentalFee, int age) {
        super(brand, model, color, luggageCapacity, fuelType, dailyRentalFee, age);
    }


    @Override
    public double calculateDailyRentalCost(int period) {
        double discount = this.getDailyRentalFee() * this.getAge() * 0.2 * period;
        return this.getDailyRentalFee()*period-discount;
    }

    @Override
    public double calculateMonthlyRentalCost(int period) {
        double monthlyCost=  300 * period * 30;
        return  monthlyCost;
    }
}
