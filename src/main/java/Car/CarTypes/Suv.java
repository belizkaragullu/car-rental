package Car.CarTypes;

public class Suv extends Car.Car {
//paketleri yanlis mi yazdim?

    public Suv(String brand, String model, String color, int luggageCapacity, String fuelType, double dailyRentalFee, int age) {
        super(brand, model, color, luggageCapacity, fuelType, dailyRentalFee, age);
    }

    @Override
    public double calculateDailyRentalCost(int period) {
        double discount = this.getDailyRentalFee() * this.getAge() * 0.1 * period; //this mi super mi?
        return this.getDailyRentalFee()*period-discount;
    }
}
