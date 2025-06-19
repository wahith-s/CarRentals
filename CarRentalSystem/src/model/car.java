package model;

public class car extends vehicle {
    private String fuelType;
    private double rentPerDay;

    public car(int id, String model, String fuelType, double rentPerDay) {
        super(id, model);
        this.fuelType = fuelType;
        this.rentPerDay = rentPerDay;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + id + ", Model: " + model + ", Fuel: " + fuelType +
                ", Rent/Day: " + rentPerDay + ", Rented: " + isRented);
    }

    public void setFuelType(String fuelType) { this.fuelType = fuelType; }
    public void setRentPerDay(double rentPerDay) { this.rentPerDay = rentPerDay; }
}
