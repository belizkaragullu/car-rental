package Car.CarTypes;

public class Suv extends Car.Car {
    public Suv(String brand, String model, String color, int luggageCapacity, int age, String fuelType, double dailyRentalFee) {
        super(brand, model, color, luggageCapacity, age, fuelType, dailyRentalFee);
    }
//paketleri yanlis mi yazdim?


    @Override
    public double calculateDailyRentalCost(int period) {
        double discount = this.getDailyRentalFee() * this.getAge() * 0.1 * period; //this mi super mi?
        return this.getDailyRentalFee()*period-discount;
    }
}
