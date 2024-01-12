package Car.CarTypes;

public class Suv extends Car.Car {

    private boolean luxury;

    public Suv(String brand, String model, String color, int luggageCapacity, int age, String fuelType, double dailyRentalFee, boolean luxury) {
        super(brand, model, color, luggageCapacity, age, fuelType, dailyRentalFee);
        this.luxury=luxury;
    }



    @Override
    public double calculateDailyRentalCost(int period) {
        double discount;


        if(luxury==true){
            discount= this.getDailyRentalFee() * this.getAge() * 0.1 * period;
        }
        else {
            discount= this.getDailyRentalFee() * this.getAge() * 0.3 * period;
        }

        return this.getDailyRentalFee()*period-discount;
    }
}
