package Car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private int luggageCapacity;
    private int age;
    private String fuelType;
    private double dailyRentalFee;


    public double calculateDailyRentalCost(int period){
        return 0;
    }

}
