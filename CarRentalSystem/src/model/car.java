package model;

import java.io.FileWriter;

public class car extends vehicle {
    private String fuelType;
    private double rentPerDay;
    private int days;
    // Removed FileWriter initialization from here to avoid unhandled exception

    public car(int id, String model, String brand ,String fuelType,  double rentPerDay) {
        super(id, model,brand);
        this.fuelType = fuelType;
        this.rentPerDay = rentPerDay;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + id + ", Model: " + model + ", Fuel: " + fuelType + ", Rent/Day: " + rentPerDay + ", Rented: " + isRented);
    }
//    public void invoice() {
//        System.out.println("Invoice for Car ID: " + id);
//        System.out.println("Model: " + model);
//        System.out.println("Fuel Type: " + fuelType);
//        System.out.println("Rent per Day: " + rentPerDay);
//        System.out.println("Days Rented: " + days);
//        System.out.println("Total Amount: " + (rentPerDay * days));
//        try (FileWriter fileWriter = new FileWriter("Sample Invoice.txt", true)) {
//            fileWriter.write("Invoice for Car ID: " + id + "\n");
//            fileWriter.write("Model: " + model + "\n");
//            fileWriter.write("Fuel Type: " + fuelType + "\n");
//            fileWriter.write("Rent per Day: " + rentPerDay + "\n");
//            fileWriter.write("Days Rented: " + days + "\n");
//            fileWriter.write("Total Amount: " + (rentPerDay * days) + "\n\n");
//        } catch (java.io.IOException e) {
//            System.out.println("Error writing invoice: " + e.getMessage());
//        }
//    }

    public void setFuelType(String fuelType) { this.fuelType = fuelType; }
    public void setRentPerDay(double rentPerDay) { this.rentPerDay = rentPerDay; }

    
}
