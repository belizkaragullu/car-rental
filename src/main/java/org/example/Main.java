package org.example;

import Car.CarTypes.Hatchback;
import Car.CarTypes.Sedan;
import Car.CarTypes.Suv;
import Customer.CompanyCustomer;
import Customer.IndividualCustomer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        IndividualCustomer individualCustomer = new IndividualCustomer(05451230000, "Beliz", "Karagullu");
        CompanyCustomer companyCustomer = new CompanyCustomer(02164440000, "A Company");

        Hatchback hatchback = new Hatchback("Hatchback", "Model1", "Red", 4, 2,"Petrol", 100);
        Sedan sedan = new Sedan("Sedan", "Model2", "Blue", 5, 1,"Diesel", 150);
        Suv suv = new Suv("Suv", "Model3", "Black", 6, 3,"Gasoline", 200, false);
        Suv luxSuv = new Suv("Luxury Suv", "Model3", "Black", 6, 3,"Gasoline", 200, true);


        if (!individualCustomer.isCanRentAllCars()) {

            System.out.println("Individual customers can only rent Hatcback cars.");

            System.out.println(hatchback.getBrand() + " " + hatchback.getModel() + " --- Daily Cost: " + hatchback.calculateDailyRentalCost(1));
            System.out.println(hatchback.getBrand() + " " + hatchback.getModel() + " --- MonthLy Cost: " + hatchback.calculateMonthlyRentalCost(1));

        }

        if (companyCustomer.isCanRentAllCars()) {
            System.out.println("Company customers can rent all type of cars.");

            System.out.println(hatchback.getBrand() + " " + hatchback.getModel() + " --- Daily Cost: " + hatchback.calculateDailyRentalCost(1));
            System.out.println(hatchback.getBrand() + " " + hatchback.getModel() + " --- Monthly Cost: " + hatchback.calculateDailyRentalCost(1));

            System.out.println(sedan.getBrand() + " " + sedan.getModel() + " --- Daily Cost: " + sedan.calculateDailyRentalCost(1));
            System.out.println(sedan.getBrand() + " " + sedan.getModel() + " --- Monthly Cost: " + sedan.calculateMonthlyRentalCost(1));

            System.out.println(suv.getBrand() + " " + suv.getModel() + " --- Daily Cost: " + suv.calculateDailyRentalCost(1));
            System.out.println(luxSuv.getBrand() + " " + luxSuv.getModel() + " --- Daily Cost: " + luxSuv.calculateDailyRentalCost(1));


        }

    }
}