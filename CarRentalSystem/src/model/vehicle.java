package model;

public abstract class vehicle {
    protected int id;
    protected String brand;
    protected String model;
    protected boolean isRented;

    public vehicle(int id, String model,String brand) {
        this.id = id;
        this.model = model;
        this.brand=brand;
        this.isRented = false;
    }

    public abstract void displayDetails();

    public int getId() { return id; }
    public boolean isRented() { return isRented; }
    public void setRented(boolean rented) { this.isRented = rented; }
}
